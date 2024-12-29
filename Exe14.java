import java.util.Locale;
import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
		/*Faça um programa qu pergunte quanto voce ganha por hora e
		 * o número de horas trabalhadas no mes. Calcule e mostre o total
		 * do seu salário no rferido mes, sabendo-se que são descontados 11%
		 * para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça
		 * um programa que dê:
		 * salário bruto
		 * quanto pagou ao INSS
		 * quanto pagou ao sindicato
		 * o salário líquido
		 * calcule os descontos e o salario liquido.
		 * Obs: salario bruto - descontos = salario liquido
		 */

		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Quanto vecê ganha por hora trabalhada? ");
		double granaPorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
		double horaTrabalhada = scan.nextDouble();
		
		double salarioBruto = granaPorHora * horaTrabalhada;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double descontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.printf("INSS: %.2f R$%n", inss);
		System.out.printf("IR: %.2f R$%n", ir);
		System.out.printf("Sindicato: %.2f R$%n", sindicato);
		System.out.printf("Total de Descontos: %.2f R$%n", descontos);
		System.out.printf("Salário Líquido: %.2f R$%n", salarioLiquido);
		
}
