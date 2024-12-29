import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
		/* Faça um programa que peça as 4 notas 
		 * bimestrais e mostre a média.
		 */
		Scanner in=new Scanner(System.in);
		double notaMatematica;
		double notaPortugues;
		double notaBiologia;
		double notaHistoria;
		
		System.out.println("Digite sua nota em matemática: ");
		notaMatematica = in.nextDouble();
		System.out.println("Digite sua nota em português: ");
		notaPortugues = in.nextDouble();
		System.out.println("Digite sua nota em Biologia: ");
		notaBiologia = in.nextDouble();
		System.out.println("Digite sua nota em história; ");
		notaHistoria = in.nextDouble();
		
		double media = (notaMatematica + notaPortugues + notaBiologia + notaHistoria) / 4;
		
		System.out.println("A média das 4 notas é: " + media);
	}
}
