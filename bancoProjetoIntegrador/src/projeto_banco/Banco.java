package projeto_banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, ContaBancaria> contas;
    private static Banco instancia;

    private Banco() {
        contas = new HashMap<>();
    }

    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void adicionarConta(String numeroConta, ContaBancaria conta) {
        if (!contas.containsKey(numeroConta)) {
            contas.put(numeroConta, conta);
            System.out.println("Conta " + numeroConta + " adicionada com sucesso.");
        } else {
            System.out.println("Conta com número " + numeroConta + " já existe.");
        }
    }

    public ContaBancaria buscarConta(String numeroConta) {
        return contas.get(numeroConta);
    }

    public void listarContas() {
        System.out.println("Contas no banco:");
        for (ContaBancaria conta : contas.values()) {
            System.out.println("Conta: " + conta.getNumeroConta() + " - Saldo: R$ " + conta.getSaldo());
        }
    }
}