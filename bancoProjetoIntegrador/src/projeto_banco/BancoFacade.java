package projeto_banco;

public class BancoFacade {
    private Banco banco;

    public BancoFacade() {
        banco = Banco.getInstancia();
    }

    public void criarConta(String tipo, String numeroConta, double saldoInicial) {
        ContaFactory factory;

        // Escolher a fábrica com base no tipo de conta
        if ("corrente".equalsIgnoreCase(tipo)) {
            factory = new ContaCorrenteFactory();
        } else if ("poupanca".equalsIgnoreCase(tipo)) {
            factory = new ContaPoupancaFactory();
        } else {
            System.out.println("Tipo de conta inválido.");
            return;
        }

        // Criar a conta usando a fábrica
        ContaBancaria conta = factory.criarConta(numeroConta, saldoInicial);
        banco.adicionarConta(numeroConta, conta);
    }

    public void depositar(String numeroConta, double valor) {
        ContaBancaria conta = banco.buscarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void sacar(String numeroConta, double valor) {
        ContaBancaria conta = banco.buscarConta(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void listarContas() {
        banco.listarContas();
    }
}
