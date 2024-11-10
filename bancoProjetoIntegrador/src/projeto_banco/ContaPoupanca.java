package projeto_banco;

public class ContaPoupanca implements ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    @Override
    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
