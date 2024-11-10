package projeto_banco;

public interface ContaFactory {
    ContaBancaria criarConta(String numeroConta, double saldoInicial);
}
