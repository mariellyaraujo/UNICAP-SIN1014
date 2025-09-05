package atvsClasse.atvHeranca;

public class Contas {
    public static void main (String[] args){
        ///criação de objetos
        ContaPoupanca cp = new ContaPoupanca("melly economista", 230925, 300,12);

        ContaEspecial ce = new ContaEspecial("melly especial", 020606, 500, -200);

        /// chamada de metodos
        //Conta Poupança
        cp.sacar(200);
        cp.depositar(100);
        cp.calcularNovoSaldo(0.5);

        System.out.println("Cliente: " + cp.getCliente() + "\nConta: " + cp.getNumConta() + "\nSaldo: " + cp.getSaldo());

        //Conta Especial
    }
}