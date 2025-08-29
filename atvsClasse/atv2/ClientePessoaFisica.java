package atvsClasse.atv2;

public class ClientePessoaFisica extends Cliente {
    String cpf;

    public ClientePessoaFisica (String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        super.setEndereco(endereco);
    }

    public String getCpf (){
        return this.cpf;
    }

    public String getEndereco(){
        return super.getEndereco();
    }
}