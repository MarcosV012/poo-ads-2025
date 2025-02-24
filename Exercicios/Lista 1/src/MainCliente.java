import exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1300, 60, "João", 1000);
        obj1.realizarDeposito(500);
        obj1.realizarSaque(2000);
        obj1.dadosCliente();
    }
}
