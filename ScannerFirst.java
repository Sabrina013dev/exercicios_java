import java.util.Locale;
import java.util.Scanner;

public class ScannerFirst {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in).useLocale(Locale.US);
        String cidade1, cidade2;
        int distancia;
        double costPorMilha;
        double realQuantia;

        System.out.println("Insira a cidade de início: ");
        cidade1= in.next();

        System.out.println("Insira a cidade de destino; ");
        cidade2= in.next();

        System.out.println("Digite a distância entre as cidades: ");
        while (!in.hasNextInt()) {
            System.out.println("Por favor, insira um número inteiro válido para a distância.");
            in.next();
        }
        distancia = in.nextInt();


        System.out.println("Agora digite o custo por milha (ex: 1.25): ");
        while (!in.hasNextDouble()) {
            System.out.println("Por favor, insira um número válido para o custo por milha.");
            in.next();
        }
        costPorMilha = in.nextDouble();

        realQuantia= distancia * costPorMilha;
        System.out.printf("O custo da viagem de: %s para %s é $%.2f\n", cidade1, cidade2, realQuantia);

    }
}
