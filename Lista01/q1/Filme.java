package Lista01.q1;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    ///Construtores
    public Filme(String titulo, String genero, int anoLancamento){
        setTitulo(titulo);
        setGenero(genero);
        setAnoLancamento(anoLancamento);
    }
    //sobrecarga
    public Filme(String titulo, String genero){
        setTitulo(titulo);
        setGenero(genero);
        setAnoLancamento(0);
    }

    ///setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    ///getters
    public String getTitulo(){
        return this.titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getAnoLancamento(){
        return this.anoLancamento;
    }

    ///to String
    public String toString(){
        if(this.anoLancamento == 0){
            return "Titulo: " + getTitulo() + "\nGênero: " + getGenero() + "\nAno de Lançamento: Indefinido";
        } else {
            return "Titulo: " + getTitulo() + "\nGênero: " + getGenero() + "\nAno de Lançamento: " + getAnoLancamento();
        }
    }
}
