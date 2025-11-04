import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int N = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= N; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números ímpares de 1 até " + N + " é: " + soma);
    }
}
