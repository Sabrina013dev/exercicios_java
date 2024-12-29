import java.util.Locale;
import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
		/*. Tendo como dados de entrada a altura e o sexo de uma pessoa,
		 *  construa um algoritmo que calcule seu peso ideal, utilizando
		 *   as seguintes fórmulas: 
		 *   Para homens: (72.7*h) - 58 a. 
		 *   Para mulheres: (62.1*h) - 44.7 (h = altura) b. 
		 *   Peça o peso da pessoa e informe se ela está dentro, 
		 *   acima ou abaixo do peso.
		 */
		 Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite sua altura (em metros): ");
		double altura = scan.nextDouble();
		
		System.out.println("Digite o seu sexo (M para masculino, F para feminino");
		String sexo = scan.next().trim().toUpperCase();
		
		System.out.println("Digite seu peso atual (em kg): ");
		double pesoAtual = scan.nextDouble();
		
		double pesoIdeal;
		
		if (sexo.equals("M") ) {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo.equals("F")) {
			pesoIdeal = (62.1 * altura) - 44.7;
		}else {
			System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino");
			return;
		}
		
		System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
		
		if (pesoAtual < pesoIdeal) {
			System.out.println("Você está abaixo do peso.");
		}else if (pesoAtual > pesoIdeal) {
			System.out.println("Você está acima do peso.");
		}else{
			System.out.println("Você está dentro do peso ideal.");
		}
	}
}
