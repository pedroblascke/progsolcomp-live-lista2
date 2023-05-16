//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema13
//Data:16/05/2023
public class Problema13 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
