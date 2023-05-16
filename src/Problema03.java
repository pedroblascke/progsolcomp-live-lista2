//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema03
//Data:16/05/2023
import java.util.Scanner;

public class Problema03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        teclado.close();
    }
}
