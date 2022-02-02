package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class MetrosParaCentimetros {
    // Faça um Programa que converta metros para centímetros.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metros, centimetros;

        System.out.print("Informe a quantidade em metros: ");
        metros = scan.nextDouble();

        centimetros = metros * 100;

        System.out.println("Centímetros: " + centimetros);
    }
}
