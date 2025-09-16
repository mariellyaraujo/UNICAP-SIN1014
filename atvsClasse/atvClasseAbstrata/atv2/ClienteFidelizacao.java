package atvsClasse.atvClasseAbstrata.atv2;

public class ClienteFidelizacao extends Cliente{
    private double bonus;
    private String validade;
    public ClienteFidelizacao(String nome, String endereco, InfoCliente infocliente, double bonus, String validade){
        super(nome, endereco, infocliente);

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
