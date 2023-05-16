//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema04
//Data:16/05/2023
import java.util.Scanner;

public class Problema04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        String parImpar = (numero % 2 == 0) ? "par" : "ímpar";
        String positivoNegativo = (numero >= 0) ? "positivo" : "negativo";

        System.out.println("O número digitado é " + parImpar + " e " + positivoNegativo + ".");

        teclado.close();
    }
}
