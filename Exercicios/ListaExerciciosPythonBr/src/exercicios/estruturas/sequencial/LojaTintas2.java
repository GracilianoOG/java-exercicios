package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class LojaTintas2 {
    // Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    // Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
    // que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
    //
    //    Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    //    comprar apenas latas de 18 litros;
    //    comprar apenas galões de 3,6 litros;
    //    misturar latas e galões, de forma que o desperdício de tinta seja menor.
    //    Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metros, litros, totPreco;
        double totLatas = 0, totGaloes = 0;

        System.out.print("Informe o tamanho em metros quadrados: ");
        metros = scan.nextDouble();

        litros = metros / 6;
        totLatas = Math.ceil(litros / 18);
        totGaloes = Math.ceil(litros / 3.6);

        System.out.printf("Total de latas.....: %.0f\n", totLatas);
        System.out.printf("Total de galões....: %.0f\n", totGaloes);
        System.out.printf("Preço das latas....: R$%.2f\n", (80.0 * totLatas));
        System.out.printf("Preço dos galões...: R$%.2f\n", (25.0 * totGaloes));
    }
}
