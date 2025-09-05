package atvsClasse.atvHeranca;

public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;

    ///construtor
    public ContaPoupanca(String cliente, int numConta, double saldo, int diaDeRendimento){
        super(cliente, numConta, saldo);
        setDiaDeRendimento(diaDeRendimento);
    }

    ///set & get
    public void setDiaDeRendimento(int diaDeRendimento){
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento(){
        return this.diaDeRendimento;
    }

    public void calcularNovoSaldo(double taxa){
        double saldo = getSaldo();
        setSaldo(saldo + saldo*taxa);
    }

}