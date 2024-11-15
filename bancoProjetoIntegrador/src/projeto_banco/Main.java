package projeto_banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BancoFacade bancoFacade = new BancoFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Tipo de conta (corrente/poupanca): ");
                    String tipo = scanner.next();
                    System.out.print("Número da conta: ");
                    String numeroConta = scanner.next();
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    bancoFacade.criarConta(tipo, numeroConta, saldoInicial);
                    break;
                case 2:
                    System.out.print("Número da conta: ");
                    numeroConta = scanner.next();
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    bancoFacade.depositar(numeroConta, valorDeposito);
                    break;
                case 3:
                    System.out.print("Número da conta: ");
                    numeroConta = scanner.next();
                    System.out.print("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    bancoFacade.sacar(numeroConta, valorSaque);
                    break;
                case 4:
                    bancoFacade.listarContas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
