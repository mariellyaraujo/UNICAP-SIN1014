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
}
