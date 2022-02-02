package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class InformaNumero {
    // Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = scan.nextInt();

        System.out.println("Número informado foi: " + num);
    }
}
