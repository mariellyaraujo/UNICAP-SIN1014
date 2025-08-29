package atvsClasse.atv1;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento depto;

    /// setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    /// getters
    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public Departamento getDepto() {
        return this.depto;
    }

    /// construtor
    public Funcionario(int matricula, String nome, Departamento depto) {
        setMatricula(matricula);
        setNome(nome);
        setDepto(depto);
    }

    /// toString
    public String toString() {
        return "Funcionario: \nmatricula: " + getMatricula() + "\nnome: " + getNome() + "\n" + getDepto().toString();
    }
}