import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite quantos números da sequência de Fibonacci deseja ver: ");
        int N = sc.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Os primeiros " + N + " números da sequência de Fibonacci são:");

        for (int i = 1; i <= N; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
