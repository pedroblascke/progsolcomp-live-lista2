//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema18
//Data:16/05/2023
import java.util.Scanner;

public class Problema18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        teclado.close();
    }
}

