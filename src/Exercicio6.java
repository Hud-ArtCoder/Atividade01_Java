import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println(" Par ou Impar ");

        // Pedir numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        // Descobrir se é impar ou par

        if (n1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");

        }
    }
}