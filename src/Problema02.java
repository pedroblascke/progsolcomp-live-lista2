//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema02
//Data:16/05/2023
import java.util.Scanner;

public class Problema02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int c = teclado.nextInt();
        
        int i;
        
        // Ordem crescente;
        if (a > b) {
            i = a;
            a = b;
            b = i;
        }
        
        if (b > c) {
            i = b;
            b = c;
            c = i;
        }
        
        if (a > b) {
            i = a;
            a = b;
            b = i;
        }
        
        System.out.println("Em ordem crescente: " + a + ", " + b + ", " + c);
        
        teclado.close();
    }
}