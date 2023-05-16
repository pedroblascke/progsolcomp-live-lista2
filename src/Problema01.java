//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema01
//Data:16/05/2023
import java.util.Scanner;

public class Problema01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();
        
        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os números são iguais.");
        }
        
        teclado.close();
    }
}