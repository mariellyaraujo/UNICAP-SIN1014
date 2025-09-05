package atvsClasse.atv3;

public class CachorroAdestrado extends Cachorro{

    public CachorroAdestrado(String nome, String raca){
        super(nome, raca);
    }

    public void deitar(){
        System.out.println(getNome() + " deitou");
    }
    public void rolar(){
        System.out.println(getNome() + " rola");
    }
    public void fingirDeMorto(){
        System.out.println(getNome() + " finge de morto");
    }
}