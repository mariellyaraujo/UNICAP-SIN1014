package atvsClasse.atvClasseAbstrata.atv1.atv2;

public class MainCliente {
    public static void main(String[] args){
        InfoCliente infoc1 = new InfoClientePessoaFisica("71437729410");
        Cliente c1 = new ClienteFidelizacao("melly fiel", "boa vista", infoc1, 66.6, "23");

    }
}
