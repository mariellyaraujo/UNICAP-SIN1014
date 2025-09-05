package atvsClasse.atv3;

public class Cachorro{
    private String nome;
    private String raca;

    public Cachorro(String nome, String raca){
        setNome(nome);
        setRaca(raca);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }


    public String getNome(){
        return this.nome;
    }
    public String getRaca(){
        return this.raca;
    }


    public void latir(){
        System.out.println(getNome() + " late");
    }
    public void dormir(){
        System.out.println(getNome() + " dorme");
    }
    public void comer(){
        System.out.println(getNome() + " come");
    }
}