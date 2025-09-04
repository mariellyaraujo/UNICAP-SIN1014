package atvsClasse.atvHeranca;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(double limite, String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
        setLimite(limite);
    }
    ////fazer os setters e getters do conta bancaria
    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }
}