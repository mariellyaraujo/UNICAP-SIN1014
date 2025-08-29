package atvsClasse.atv1;

public class Departamento {
    private int codigo;
    private String nome;

    /// get set codigo
    public void setCodigo(int codigo) {
        if (codigo > 0)
            this.codigo = codigo;
        else
            System.out.println("coloque um codigo maior que 0");
    }

    public int getCodigo() {
        return this.codigo;
    }

    /// get set nome
    public void setNome(String nome) {
        this.nome = nome;
        // System.out.println("coloque um nome valido");

    }

    public String getNome() {
        return this.nome;
    }

    /// construtor
    public Departamento(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
    }

    /// toString - um método correto de imprimir um objeto

    public String toString() {
        return "Departamento: \nnome: " + getNome() + "\ncodigo: " + getCodigo();
    }
}