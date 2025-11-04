import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (a): ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente (b): ");
        int expoente = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + expoente + " = " + resultado);
    }
}
