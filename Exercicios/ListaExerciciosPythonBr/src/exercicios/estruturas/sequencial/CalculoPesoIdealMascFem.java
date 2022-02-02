package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class CalculoPesoIdealMascFem {
    // Tendo como dados de entrada a altura de uma pessoa,
    // construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float altura, pesoIdealMasc, pesoIdealFem;

        System.out.print("Informe a altura: ");
        altura = scan.nextFloat();

        pesoIdealMasc = ((72.7f * altura) - 58);
        pesoIdealFem = ((62.1f * altura) - 44.7f);

        System.out.printf("\nPeso ideal - Homens..: %.2f KG", pesoIdealMasc);
        System.out.printf("\nPeso ideal - Mulheres: %.2f KG", pesoIdealFem);
    }
}
