package ProjetoGeometrico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha um objeto geométrico:");
            System.out.println("1 - Círculo");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(largura, altura);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
