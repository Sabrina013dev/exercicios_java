import java.util.Locale;
import java.util.Scanner;

public class exe13 {
    
	public static void main(String[] args) {
		/* Faça um programa que peça o tamanho d um arquivo para download
		 * (em MB) e a velocidade de um link de internet (em Mbps), calcule
		 * e informe o tempo aproximado de download do arquivo usando este
		 * link (em minutos).
		 */
		
		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite o tamanho do arquivo");
		double downloadMbTamanho = scan.nextDouble();
		
		System.out.println("Digite a velocidade em Mbps do arquivo: ");
		double velocidadeMbps = scan.nextDouble();
		
		double tempoAproximado = downloadMbTamanho / velocidadeMbps;
		
		System.out.println("O tempo aproximado é: " + tempoAproximado);
	}

}
