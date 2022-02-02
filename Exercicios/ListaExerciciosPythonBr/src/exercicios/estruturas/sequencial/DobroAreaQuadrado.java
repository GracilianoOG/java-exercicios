package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class DobroAreaQuadrado {
    // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area, base, altura;

        System.out.print("Informe a base do quadrado: ");
        base = scan.nextDouble();

        System.out.print("Informe a altura do quadrado: ");
        altura = scan.nextDouble();

        area = base * altura;

        System.out.println("\nBase..: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área..: " + area);
        System.out.println("Dobro.: " + (area * 2));
    }
}
