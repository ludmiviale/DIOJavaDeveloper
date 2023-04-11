import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] NumerosAleatorios = new int[20];

        for (int i = 0; i < NumerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            NumerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatorios: ");
        for (int numero : NumerosAleatorios) {
            System.out.println(numero);
        }

        System.out.println("\nSucessores dos Números aleatorios: ");
        for (int numero : NumerosAleatorios) {
            System.out.println((numero + 1) + " ");
        }

        System.out.println("\nAntecessores dos Números aleatorios: ");
        for (int numero : NumerosAleatorios) {
            System.out.println((numero - 1) + " ");
        }
    }
}