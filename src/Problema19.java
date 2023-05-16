//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema19
//Data:16/05/2023
import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volumeInicial = teclado.nextInt();

        int tempo = 0;
        int volume = volumeInicial;

        while (volume <= 1000) {
            volume *= 2;
            tempo++;
        }

        System.out.println("O volume se torna maior que 1000 cm³ em " + tempo + " segundos.");

        teclado.close();
    }
}






