//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema20
//Data:16/05/2023
import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = teclado.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas: ");
        int pessoasMaximas = teclado.nextInt();

        int pesoTotal = 0;
        int numeroPessoas = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = teclado.nextInt();

            if (pesoTotal + peso <= cargaMaxima && numeroPessoas < pessoasMaximas) {
                pesoTotal += peso;
                numeroPessoas++;
                System.out.println("Pessoa adicionada ao elevador.");
            } else {
                System.out.println("Limite de carga ou número máximo de pessoas atingido.");
                break;
            }
        } while (true);

        System.out.println("Total de pessoas no elevador: " + numeroPessoas);
        System.out.println("Peso total no elevador: " + pesoTotal + " kg");

        teclado.close();
    }
}
