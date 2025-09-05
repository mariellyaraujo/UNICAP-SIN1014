package atvsClasse.atv2;

public class ClientePessoaJuridica extends Cliente{
    private int cnpj;

    public ClientePessoaJuridica (String nome, String endereco, int cnpj){
        super(nome, endereco);
        setCnpj(cnpj);
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }

    public int getCnpj(){
        return this.cnpj;
    }
}
