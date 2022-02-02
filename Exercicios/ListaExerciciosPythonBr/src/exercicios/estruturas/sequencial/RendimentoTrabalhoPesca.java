package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class RendimentoTrabalhoPesca {
    // João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
    // Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
    // (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a
    // variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
    // e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int PESO_MAX = 50;
        final double PRECO_MULTA = 4.0;
        double peso, multa, excesso;

        System.out.print("Informe a quantidade de peixes: ");
        peso = scan.nextDouble();

        excesso = peso - PESO_MAX;

        System.out.println("Peso atual......: " + peso);
        System.out.println("Peso máximo.....: " + PESO_MAX);

        if (excesso >= 1) { // Considerando que o resto não conta, não vai pra conta final
            multa = (int) excesso * PRECO_MULTA;
            System.out.println("Quilos excedidos: " + excesso);
            System.out.println("Multa a pagar...: " + multa);
        }
    }
}
