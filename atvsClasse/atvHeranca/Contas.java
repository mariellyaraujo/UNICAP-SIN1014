package atvsClasse.atvHeranca;

public class Contas {
    public static void main (String[] args){
        ///criação de objetos
        ContaPoupanca cp = new ContaPoupanca("melly economista", 230925, 300,12);

        ContaEspecial ce = new ContaEspecial("melly especial", 266, 500, -200);

        /// chamada de metodos
        //Conta Poupança
        cp.sacar(200);
        cp.depositar(100);
        cp.calcularNovoSaldo(0.5);

        System.out.println("---Conta Poupança---\nCliente: " + cp.getCliente() + "\nConta: " + cp.getNumConta() + "\nSaldo: " + cp.getSaldo());

        //Conta Especial
        ce.sacar(700);
        ce.depositar(100);

        System.out.println("---Conta Especial---\nCliente: " + ce.getCliente() + "\nConta: " + ce.getNumConta() + "\nSaldo: " + ce.getSaldo());
    }
}