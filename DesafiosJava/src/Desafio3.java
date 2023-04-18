/*
 * Neste desafio, faça um programa que calcule o valor de H com N termos. 
 * Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
 */

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double n = sc.nextDouble();

        double h = 0.0;
        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }

        System.out.println(Math.round(h));

        sc.close();
    }
}