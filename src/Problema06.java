//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema06
//Data:16/05/2023
import java.util.Scanner;

public class Problema06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 100): ");
        int nota = teclado.nextInt();

        String conceito;

        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Conceito do aluno: " + conceito);

        teclado.close();
    }
}