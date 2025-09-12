package atvsClasse.atvClasseAbstrata.atv1.atv2;

public class ClienteFidelizacao extends Cliente{
    private double bonus;
    private String validade;
    public ClienteFidelizacao(String nome, String endereco, double bonus, String validade){
        super(nome, endereco);

        setBonus(bonus);
        setValidade(validade);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public void setValidade(String validade){
        this.validade = validade;
    }

    public double getBonus(){
        return this.bonus;
    }
    public String getValidade(){
        return this.validade;
    }
}
