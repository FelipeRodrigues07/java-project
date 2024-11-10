package projeto_banco;


public class ContaCorrenteFactory implements ContaFactory {

    @Override
    public ContaBancaria criarConta(String numeroConta, double saldoInicial) {
        return new ContaCorrente(numeroConta, saldoInicial);
    }
}
