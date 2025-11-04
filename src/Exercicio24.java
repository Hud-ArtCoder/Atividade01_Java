import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int N = sc.nextInt();

        System.out.println("Contagem regressiva:");
        for (int i = N; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println(" Fim da contagem!");
    }
}
