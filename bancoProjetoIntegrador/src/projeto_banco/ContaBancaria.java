package projeto_banco;

public interface ContaBancaria {
	    String getNumeroConta();
	    double getSaldo();
	    void depositar(double valor);
	    void sacar(double valor);
}
