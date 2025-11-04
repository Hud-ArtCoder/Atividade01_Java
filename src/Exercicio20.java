import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taxas fixas de conversão (exemplo)
        final double TAXA_DOLAR = 5.00; // 1 USD = 5.00 BRL
        final double TAXA_EURO = 5.30;  // 1 EUR = 5.30 BRL

        System.out.print("Digite o valor em reais (R$): ");
        double reais = sc.nextDouble();

        System.out.print("Converter para (1) Dólar ou (2) Euro? ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            double convertido = reais / TAXA_DOLAR;
            System.out.printf("R$%.2f equivalem a US$%.2f\n", reais, convertido);
        } else if (opcao == 2) {
            double convertido = reais / TAXA_EURO;
            System.out.printf("R$%.2f equivalem a €%.2f\n", reais, convertido);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
