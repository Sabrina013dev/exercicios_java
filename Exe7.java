import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
		/* Faça um programa que pergunte quanto vc ganha por hora
		 * e o número de horas trabalhadas no mês. Calcule e mostre
		 * o total do seu salário no referido mês.
		 */
		Scanner in=new Scanner(System.in);
			double salario;
			double horasTrabalhadas;
			
			System.out.println("Quanto você ganha por hora trabalhada? R$");
			salario = in.nextDouble();
			
			System.out.println("Digite o número de horas trabalhadas no mês: ");
			horasTrabalhadas = in.nextDouble();
			
			double total = salario * horasTrabalhadas;
			System.out.printf("O salário nesse mês será: R$ %.2f%n" , total);
    }

}
