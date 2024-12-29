import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
		/* Faça um programa que peça dois números
		 * e imprima a soma.
		 */
		Scanner in=new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = in.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = in.nextInt();
		
		int resultado = num1 + num2;
		
		System.out.println("A soma dos dois números é: " + resultado);

	}
}
