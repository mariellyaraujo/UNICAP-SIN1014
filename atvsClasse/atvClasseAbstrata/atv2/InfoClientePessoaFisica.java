package atvsClasse.atvClasseAbstrata.atv1.atv2;

public class InfoClientePessoaFisica extends InfoCliente{
    private String cpf;

    public InfoClientePessoaFisica(String cpf){
        setCpf(cpf);
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(String cpf){
        return this.cpf;
    }
}
