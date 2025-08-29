public class ImpDepartamento {
    public static void main(String[] args) {
        Departamento d = new Departamento(2309, "Operações");
        Funcionario f = new Funcionario(12345, "Melly", d);

        System.out.print(f.toString());
    }
}