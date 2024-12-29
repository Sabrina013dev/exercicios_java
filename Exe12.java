import java.util.Locale;
import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
		/*. João Papo-de-Pescador, homem de bem, comprou um microcomputador
		 *  para controlar o rendimento diário de seu trabalho.
		 *  Toda vez que ele traz um peso de peixes maior que o estabelecido
		 *  pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
		 *  pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
		 *  você faça um programa que leia a variável peso (peso de peixes) e
		 *  verifique se há excesso. Se houver, gravar na variável excesso e
		 *  na variável multa o valor da multa que João deverá pagar. Caso
		 *  contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Quantos kilos de peixe você trouxe? ");
		double quiloDePeixe = scan.nextDouble();
		
		double excesso = 0.0;
		double multa = 0.0;
		
		final double PESO_LIMITE = 50.0;
		final double MULTA_QUILO = 4.0;
		
		if (quiloDePeixe > PESO_LIMITE) {
			excesso = quiloDePeixe - PESO_LIMITE;
			multa = excesso * MULTA_QUILO;
		}
		System.out.printf("Excesso de peso é: %.2f kg%n", excesso);
		System.out.printf("A multa é: %.2f kg%n", multa);
	}
}
