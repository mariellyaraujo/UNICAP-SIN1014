package atvsClasse.atvClasseAbstrata.atv1.atv2;

public abstract class Cliente {
    private String nome;
    private String endereco;
    private InfoCliente infocliente;

    public Cliente(String nome, String endereco, InfoCliente infocliente){
        setNome(nome);
        setEndereco(endereco);
        setInfoCliente(infocliente);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setInfoCliente(InfoCliente infocliente){
        this.infocliente = infocliente;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public InfoCliente getInfoCliente(){
        return this.infocliente;
    }
}
