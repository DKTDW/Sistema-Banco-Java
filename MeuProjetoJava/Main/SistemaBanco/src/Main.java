public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa ABC", "12345678000195");
        Cliente cliente = new Cliente("Cliente XYZ", "12345678909");

        empresa.realizarTransacao(cliente, 50.00, "deposito");
        empresa.realizarTransacao(cliente, 50.00, "saque");
    }
}
