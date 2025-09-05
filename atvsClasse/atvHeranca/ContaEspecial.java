package atvsClasse.atvHeranca;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo, double limite){
        super(cliente, numConta, saldo);
        setLimite(limite);
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }

    @Override
    public boolean sacar(double valor){
        if(getSaldo() - valor >= limite){
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

}