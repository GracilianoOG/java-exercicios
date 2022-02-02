package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class CelciusParaFah {
    // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float celcius, fahrenheit;

        System.out.print("Informe a temperatura em Celcius: ");
        celcius = scan.nextFloat();

        fahrenheit = (celcius * 1.8f) + 32;

        System.out.printf("Graus Fahrenheit: %.1f", fahrenheit);
    }
}
