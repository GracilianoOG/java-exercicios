package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class QuatroNotasBimestrais {
    // Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {
        double[] notas = new double[4];
        double media = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i+1) + "° " + "média: ");
            notas[i] = scan.nextDouble();
        }

        for(double nota : notas) {
            media += nota;
        }
        media /= 4;

        System.out.println("Média: " + media);
    }
}
