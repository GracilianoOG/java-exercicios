package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class CalculosDiversos {
    // Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    //    Q1 o produto do dobro do primeiro com metade do segundo .
    //    Q2 a soma do triplo do primeiro com o terceiro.
    //    Q3 o terceiro elevado ao cubo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        float num3;
        float q1, q2, q3;

        System.out.println("Informe o primeiro número inteiro: ");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo número inteiro: ");
        num2 = scan.nextInt();

        System.out.println("Informe um número real: ");
        num3 = scan.nextFloat();

        q1 = (num1*2) * (num2/2);
        q2 = (num1*3) + num3;
        q3 = num3 * num3 * num3;

        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
    }
}
