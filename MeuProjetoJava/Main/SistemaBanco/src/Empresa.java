import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.io.OutputStream;

class Empresa extends Usuario {
    private String cnpj;
    private double saldo;

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
        this.saldo = 100.00; // saldo inicial
    }

    public void realizarTransacao(Cliente cliente, double valor, String tipo) {
        if (tipo.equalsIgnoreCase("deposito")) {
            saldo += valor;
            enviarCallback(cliente, valor, tipo);
        } else if (tipo.equalsIgnoreCase("saque") && saldo >= valor) {
            saldo -= valor;
            enviarCallback(cliente, valor, tipo);
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
        System.out.printf("Saldo da empresa após %s: %.2f%n", tipo, saldo);
    }

    private void enviarCallback(Cliente cliente, double valor, String tipo) {
        String callbackUrl = "https://webhook.site/a3eb9b15-0aa3-4622-8db8-5bc5c7acfaca"; // URL única
        String jsonData = String.format("{\"cnpj\":\"%s\", \"cliente\":\"%s\", \"cpf\":\"%s\", \"valor\":%.2f, \"tipo\":\"%s\"}",
                cnpj, cliente.nome, cliente.getCpf(), valor, tipo); // Uso do CPF

        try {
            URL url = new URI(callbackUrl).toURL(); // Usando URI
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonData.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        } catch (Exception e) {
            System.out.println("Erro ao enviar callback: " + e.getMessage());
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
