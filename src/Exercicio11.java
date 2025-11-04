import java.util.Scanner;
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = sc.nextInt();

        // formula para somar os numeros
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " é: " + soma);

    }
}

