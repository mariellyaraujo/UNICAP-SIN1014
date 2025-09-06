package Lista01.q1;
import java.util.ArrayList;

public class Locadora {
    private String nome;
    private ArrayList<Filme> filmes;

    ///construtor
    public Locadora(String nome){
        setNome(nome);
        this.filmes = new ArrayList<>();
    }

    ///setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setFilmes(ArrayList<Filme> filmes){
        this.filmes = filmes;
    }

    ///getters
    public String getNome(){
        return this.nome;
    }
    public ArrayList<Filme> getFilmes(){
        return filmes;
    }

    ///metodos
    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }

    public void listarFilmes(){
        System.out.println("Filmes no " + getNome() + ":");
        for(int i = 0; i < filmes.size(); i++){
            System.out.println(filmes.get(i));
        }
    }
    
}
