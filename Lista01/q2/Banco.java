package Lista01.q2;

public class Banco {
    private Cliente clientes[];

    //getter
    public Cliente[] getClientes(){
        return this.clientes;
    }

    //metodos
    public Cliente[] cadastraCliente(){
        Cliente c1 = new Cliente("Alan Turing", "1289", 1500, 25896);
        Cliente c2 = new Cliente("Ada Love", "987654321", 12345);

        clientes = new Cliente[2];

        clientes[0] = c1;
        clientes[1] = c2;

        return clientes;
    }

    public String operacoes(){
        for(int i = 0; i < clientes.length; i++){
            clientes[i].saque(100);
            clientes[i].deposito(50);

            if(clientes[i].extrato() < 0){
                clientes[i].setSaldo(0);
            }
        }

        clientes[1].setNome("Ada LoveLace");
        clientes[0].setCpf("123456789");

        return clientes[0].toString() + "\n" + clientes[1].toString();
    }
}
