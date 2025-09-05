package atvsClasse.atv2;

public class Heranca {
    public static void main (String[] args){
        Cliente x = new ClientePessoaFisica("melly fisica", "boa vista", "123");
        Cliente y = new ClientePessoaJuridica("melly juridica", "são gonçalo", 143);

        Heranca.imprime(x);
        Heranca.imprime(y);
    }

    public static void imprime(Cliente c){
        System.out.println("Nome: " + c.getNome() + "\nEndereço: " + c.getEndereco());

        if(c instanceof ClientePessoaFisica){
            System.out.println("CPF: " + ((ClientePessoaFisica)c).getCpf());
        } else if (c instanceof ClientePessoaJuridica){
            System.out.println("CNPJ: " + ((ClientePessoaJuridica)c).getCnpj());
        }

    }
}