import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println(" Maior Que Dois Numeros ");

        // Pedir numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n1: ");
        int n1 = sc.nextInt();
        System.out.println("Digite n2: ");
        int n2 = sc.nextInt();

        // Descobrir Maior Numero

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }
    }
}