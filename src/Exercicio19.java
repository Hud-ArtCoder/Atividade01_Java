import java.util.Scanner;
import java.util.Random;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int tentativas = 0;

        System.out.println("Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = sc.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroSecreto);
    }
}
