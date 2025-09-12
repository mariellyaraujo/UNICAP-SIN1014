package atvsClasse.atvClasseAbstrata.atv1.atv2;

public abstract class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco){
        setNome(nome);
        setEndereco(endereco);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
}
