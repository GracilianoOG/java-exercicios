package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class LojaTintas {
    // Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    // Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas
    // de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metros, totLatas, totPreco, litros;

        System.out.print("Informe o tamanho em metros quadrados: ");
        metros = scan.nextDouble();

        litros = metros / 3;
        totLatas = Math.ceil(litros / 18);
        totPreco = 80.0 * totLatas;

        System.out.printf("Total de latas: %.0f\n", totLatas);
        System.out.printf("Preço total...: R$%.2f\n", totPreco);
    }
}
