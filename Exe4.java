import java.util.Scanner;

public class Exe4 {
    
		public static void main(String[] args){
	/*Faça um programa que 
	 * converta metros para centímetros
	 */
	Scanner in=new Scanner(System.in);
	
	double metros;
	double centimetro;
	
	System.out.println("Digite o valor em metros");
	metros = in.nextInt();
	System.out.println("Digite o valor em centimetros");
	centimetro = in.nextInt();
	
	double converterMetrosParaCent = metros * 100;
	double converterCentParaMetros = centimetro / 100;
	
	System.out.println("Metros para centimetros é: " + converterMetrosParaCent);
	System.out.println("Centímetros para metros é: " + converterCentParaMetros);
	
	}
}
