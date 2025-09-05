package atvsClasse.atv3;

public class AplicacaoCachorro {
    public static void main(String[] args){

    }

    public static void imprime(Cachorro c){
        System.out.println("Nome: " + c.getNome() + "\nRaça: " + c.getRaca());

        if(c instanceof CachorroAdestrado){
            System.out.println("Tem frescura?: " + ((CachorroAdestrado)c).getFrescura());
        }
    }
}
