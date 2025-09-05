package atvsClasse.atv3;

public class CachorroAdestrado extends Cachorro{
    private boolean frescura;

    public CachorroAdestrado(String nome, String raca){
        super(nome, raca);
    }

    public void setFrescura(boolean frescura){
        this.frescura = frescura;
    }
    public Boolean getFrescura(){
        return this.frescura;
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