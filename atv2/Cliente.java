package atv2;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente (String nome, String endereco){
        this.setEndereco(endereco);
        this.setNome(nome);
    }

    public void setEndereco (String endereco){
        this.endereco = endereco;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getEndereco (){
        return endereco;
    }

    public String getNome (){
        return nome;
    }
}
