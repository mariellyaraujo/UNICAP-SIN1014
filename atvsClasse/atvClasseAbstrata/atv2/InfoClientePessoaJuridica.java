package atvsClasse.atvClasseAbstrata.atv1.atv2;

public class InfoClientePessoaJuridica extends InfoCliente{
    private String cnpj;

    public InfoClientePessoaJuridica(String cnpj){
        setCnpj(cnpj);
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }
}
