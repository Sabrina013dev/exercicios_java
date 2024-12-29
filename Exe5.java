import java.util.Locale;
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
		/* Faça um programa que peça o raio de
		 * um circulo, calcule e mostre sua area
		 */
		
		Scanner in=new Scanner(System.in).useLocale(Locale.US);
		
		double raioCirculo;
		
		System.out.println("Digite o raio de um círculo: ");
		raioCirculo = in.nextDouble();
		
		
		double tamanhoDoRaio = Math.PI * Math.pow(raioCirculo, 2);
		System.out.printf("A área do círculo é: %.2f%n " , tamanhoDoRaio);
		

	}
}
