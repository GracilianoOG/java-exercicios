package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class CalcCirculoArea {
    // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area, raio;

        System.out.print("Informe o raio do círculo em metros: ");
        raio = scan.nextDouble();

        area = Math.PI * (Math.pow(raio, 2));

        System.out.println("Área: " + area);
    }
}
