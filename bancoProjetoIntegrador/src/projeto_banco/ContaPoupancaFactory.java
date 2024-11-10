package projeto_banco;

public class ContaPoupancaFactory implements ContaFactory {

    @Override
    public ContaBancaria criarConta(String numeroConta, double saldoInicial) {
        return new ContaPoupanca(numeroConta, saldoInicial);
    }
}
