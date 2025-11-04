import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Você deve digitar pelo menos um número.");
            return;
        }

        int maior, menor;

        System.out.print("Digite o 1º número: ");
        int numero = sc.nextInt();
        maior = menor = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
