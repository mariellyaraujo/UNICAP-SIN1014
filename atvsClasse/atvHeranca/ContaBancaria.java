package atvsClasse.atvHeranca;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo){
        setCliente(cliente);
        setNumConta(numConta);
        setSaldo(saldo);

    }

    /// setteres
    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    ///getters 

    public String getCliente(){
        return this.cliente;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    ///metodos
    public boolean sacar(double valor){
        if(this.saldo - valor >= 0){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}