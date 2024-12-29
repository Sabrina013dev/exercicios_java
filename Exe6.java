import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
		/* Faça um programa que calcule a área de um 
		 * quadrado, em seguida mostre o dobro desta área
		 * para o usuário.
		 */
		
		Scanner in=new Scanner(System.in);
			double ladoQuadrado;
			
			System.out.println("Digite o tamanho do lado do quadrado ");
			ladoQuadrado = in.nextDouble();
			
			double area = Math.pow(ladoQuadrado, 2);
			System.out.printf("A área do quadrado é: %.2f%n", area);
			System.out.printf("O dobro da área do quadrado é: %.2f%n", (area * 2));
	}

}
