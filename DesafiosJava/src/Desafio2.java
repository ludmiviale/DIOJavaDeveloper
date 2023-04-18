/*
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 * Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, 
 * com um dígito após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws IOException {
        Double vector[] = new Double[6];
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        Double total = 0.0;
        Double media = 0.0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un número");
            vector[i] = leitor.nextDouble();
            if (vector[i] > 0) {
                cont++;
                total = total + vector[i];
            }
        }
        media = total / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        leitor.close();
    }
}