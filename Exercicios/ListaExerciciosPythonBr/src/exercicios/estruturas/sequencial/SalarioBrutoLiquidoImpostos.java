package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class SalarioBrutoLiquidoImpostos {
    // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
    // 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    //
    //    salário bruto.
    //    quanto pagou ao INSS.
    //    quanto pagou ao sindicato.
    //    o salário líquido.
    //    calcule os descontos e o salário líquido, conforme a tabela abaixo:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horasTrabalhadas;
        double ganhoHora, salarioBruto, salarioLiquido, totDesconto;
        final double DESC_IR = 0.11;
        final double DESC_INSS = 0.08;
        final double DESC_SIND = 0.05;

        System.out.print("Quanto você ganha por hora trabalhada?\n>> ");
        ganhoHora = scan.nextDouble();

        System.out.print("Quantas horas você trabalha por mês?\n>> ");
        horasTrabalhadas = scan.nextInt();

        salarioBruto = (ganhoHora * horasTrabalhadas);
        totDesconto = (salarioBruto * (DESC_INSS + DESC_SIND + DESC_IR));
        salarioLiquido = (salarioBruto - totDesconto);

        System.out.printf("\nSalário bruto: R$ %.2f", salarioBruto);
        System.out.printf("\nINSS: R$ %.2f", salarioBruto * DESC_INSS);
        System.out.printf("\nSindicato: R$ %.2f", salarioBruto * DESC_SIND);
        System.out.printf("\nImposto de renda: R$ %.2f", salarioBruto * DESC_IR);
        System.out.printf("\nSalário líquido: R$ %.2f", salarioLiquido);
    }
}
