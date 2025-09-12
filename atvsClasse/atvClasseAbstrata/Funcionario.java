package atvsClasse.atvClasseAbstrata;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }
    //// setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    /// getters
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }

    ///metodos
    public void aumentaSalario(){
        
    }
}
