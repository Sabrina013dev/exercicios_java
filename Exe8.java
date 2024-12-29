import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
		/* Faça um programa que peça a temperatura em
		 * graus Farenheit, e transforme e mostre a temperatura
		 * em graus Celsius
		 * C = (5*((F-32)/9).
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double fTemperatura = scan.nextDouble();
		
		double celsius = (fTemperatura - 32) * 5 / 9;
		System.out.printf("A temperatura em Celsius será: %.2f°C%n", celsius);

	}

}
