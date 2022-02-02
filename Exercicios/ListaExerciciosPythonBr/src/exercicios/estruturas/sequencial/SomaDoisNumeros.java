package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class SomaDoisNumeros {
    // Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = scan.nextInt();

        soma = num1 + num2;

        System.out.println("Soma: " + soma);
    }
}
