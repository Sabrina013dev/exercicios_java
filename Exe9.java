import java.util.Scanner;

public class Exe9 {
    
	public static void main(String[] args) {
		/*Faça um programa que peça a temp. em graus
		 * Celsius, transforme e mostre em graus Farenheit.
		 */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsiusTemperatura = scan.nextDouble();
				
		double farenheit = (celsiusTemperatura * 1.8) + 32;	
		System.out.printf("A temperatura em Farenheit é: %.2f°F%n", farenheit);
	}

}
