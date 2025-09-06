package Lista01.q1;

public class LocadoraEstoque {
    public static void main(String[] args){
        Filme f1 = new Filme("sherek", "comedia");
        Filme f2 = new Filme("suspiria", "suspense", 1979);
        Filme f3 = new Filme("sharkenado", "comedia", 2012);

        Locadora loc = new Locadora("Mellyflix");

        loc.adicionarFilme(f1);
        loc.adicionarFilme(f2);
        loc.adicionarFilme(f3);

        loc.listarFilmes();

    }
}
