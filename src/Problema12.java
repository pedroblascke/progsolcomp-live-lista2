//Nome:Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa:Problema12
//Data:16/05/2023
public class Problema12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}
