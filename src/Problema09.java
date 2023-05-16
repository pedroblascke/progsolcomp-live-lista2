//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema09
//Data:16/05/2023
import java.util.Scanner;

public class Problema09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$");
        double valorVenda = teclado.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        double totalVenda = 0.0;

        switch (opcao) {
            case 1:
                totalVenda = valorVenda * 0.9; // Desconto de 10%
                break;
            case 2:
                totalVenda = valorVenda * 0.95; // Desconto de 5%
                break;
            case 3:
                totalVenda = valorVenda; // Mesmo preço
                break;
            case 4:
                totalVenda = valorVenda * 1.05; // Acréscimo de 5%
                break;
            case 5:
                totalVenda = valorVenda * 0.92; // Desconto de 8%
                break;
            case 6:
                totalVenda = valorVenda * 0.93; // Desconto de 7%
                break;
            default:
                System.out.println("Opção inválida!");
                teclado.close();
                return;
        }

        System.out.println("Total da venda: R$" + totalVenda);

        teclado.close();
    }
}