//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema16
//Data:16/05/2023
import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();

            if (numero >= 0) {
                System.out.println("Número digitado: " + numero);
            }
        } while (numero >= 0);

        System.out.println("Programa encerrado!");
        teclado.close();
    }
}
