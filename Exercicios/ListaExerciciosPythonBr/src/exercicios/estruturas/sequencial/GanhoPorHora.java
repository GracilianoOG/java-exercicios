package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class GanhoPorHora {
    // Faça um Programa que pergunte quanto você ganha por hora e o
    // número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horasTrabalhadas;
        double ganhoHora, ganhoMensal;

        System.out.print("Quanto você ganha por hora trabalhada?\n>> ");
        ganhoHora = scan.nextDouble();

        System.out.print("Quantas horas você trabalha por mês?\n>> ");
        horasTrabalhadas = scan.nextInt();

        ganhoMensal = (ganhoHora * horasTrabalhadas);

        System.out.printf("\nSeu ganho mensal é: R$ %.2f", ganhoMensal);
    }
}
