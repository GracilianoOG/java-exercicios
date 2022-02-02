package exercicios.estruturas.sequencial;

import java.util.Scanner;

public class TamanhoDownload {
    // Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet
    // (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tamArquivo, velInternet, temDownloadMin, temDownloadSec;

        System.out.print("Informe o tamanho do arquivo em MB: ");
        tamArquivo = scan.nextDouble();

        System.out.print("Informe a sua velocidade de internet em Mpbs: ");
        velInternet = scan.nextDouble();

        // Isso deu trabalho, revisar se eu ler essa parte
        temDownloadMin = ((tamArquivo / (velInternet/8)) / 60);
        temDownloadSec = Math.floor((temDownloadMin % 1) * 60);
        temDownloadMin = Math.floor(temDownloadMin);

        System.out.printf("Tempo estimado: %.0f minutos e %.0f segundos", temDownloadMin, temDownloadSec);
    }
}
