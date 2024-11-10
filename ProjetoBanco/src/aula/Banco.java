package aula;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, ContaBancaria> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void adicionarConta(String numeroConta, double saldoInicial) {
        if (!contas.containsKey(numeroConta)) {
            ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial);
            contas.put(numeroConta, conta);
            System.out.println("Conta " + numeroConta + " criada com sucesso.");
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