package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class FahParaCelcius {
    // Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    // C = 5 * ((F-32) / 9).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float fahrenheit, celcius;

        System.out.print("Informe a temperatura em Fahrenheit: ");
        fahrenheit = scan.nextFloat();

        celcius = 5 * ((fahrenheit-32) / 9);

        System.out.printf("Graus Celcius: C° %.1f", celcius);
    }
}
