package Lista01.q2;

public class Cliente {
    private String nome;
    private String cpf;
    private int saldo;
    private int numConta;

    ///construtores
    public Cliente(String nome, String cpf, int saldo, int numConta){
        setNome(nome);
        setCpf(cpf);
        setSaldo(saldo);
        setNumConta(numConta);
    }
    //sobrecarga
    public Cliente(String nome, String cpf, int numConta){
        setNome(nome);
        setCpf(cpf);
        setSaldo(0);
        setNumConta(numConta);
    }

    ///setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSaldo (int saldo){
        this.saldo = saldo;
    }
    public void setNumConta (int numConta){
        this.numConta = numConta;
    }

    ///getters
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public int getNumConta(){
        return this.numConta;
    }
}
