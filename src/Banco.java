import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
        // Criando 6 clientes
        clientes.add(new Cliente("João"));
        clientes.add(new Cliente("Pedro"));
        clientes.add(new Cliente("Maria"));
        clientes.add(new Cliente("Felipe"));
        clientes.add(new Cliente("José"));
    }

    public void imprimindoClientes() {
        // Exibindo os nomes dos clientes
        System.out.println("Nomes dos clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }

    public void numeroDeContas() {
        System.out.println("Número de clientes: " + clientes.size());
    }
}
    