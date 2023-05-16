//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema21
//Data:16/05/2023
import java.util.Scanner;

public class Problema21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. Digite um número positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                System.out.println("Tabuada do " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
                System.out.println();
            }
        }

        teclado.close();
    }
}
