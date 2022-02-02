package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class CalculoPesoIdeal {
    // Tendo como dados de entrada a altura de uma pessoa,
    // construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float altura, pesoIdeal;

        System.out.print("Informe a altura: ");
        altura = scan.nextFloat();

        pesoIdeal = ((72.7f * altura) - 58);

        System.out.printf("Peso ideal: %.2f KG", pesoIdeal);
    }
}
