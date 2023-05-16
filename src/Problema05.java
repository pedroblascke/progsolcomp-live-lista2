//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema05
//Data:16/05/2023
import java.util.Scanner;

public class Problema05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome =teclado.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.print("Digite a idade em anos: ");
        int idade = teclado.nextInt();

        teclado.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite a naturalidade: ");
        String naturalidade = teclado.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = teclado.nextLine().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }

        teclado.close();
    }
}