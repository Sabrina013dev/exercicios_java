import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
		/* Faça um programa que peça um número e então
		 * mostre a mensagem 'O número informado foi [número]
		 */
		int numero;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = in.nextInt();
		System.out.println("O número informado foi: " + numero);
	}

}
