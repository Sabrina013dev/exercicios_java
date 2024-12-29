import java.util.Scanner;

public class Exe10 {
    	public static void main(String[] args) {
		/* Faça um programa que peça 2 números inteiros
		 * e um número real calcule e mostre:
		 * * O produto do dobro do primeiro com metade do segundo.
		 * * a soma do triplo do primeiro com o terceiro
		 * o terciro elevado ao cubo.
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int num2 = scan.hashCode();
		
		System.out.println("Digite um número real: ");
		double num3 = scan.nextDouble();
		
		int resultado01 = (num1 * 2) * (num2 /2);
		double resultado02 = (num1 * 3) + num3;
		double resultado03 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1. " + resultado01);
		System.out.println("Resultado 2: " + resultado02);
		System.out.println("Resultado 3: " + resultado03);

	}

}
