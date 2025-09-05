package atvsClasse.atvHeranca;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(double limite, String cliente, int numConta, double saldo){
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
            return true;
        } else {
            return false;
        }
    }

}