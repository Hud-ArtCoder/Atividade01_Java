import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Tabela de Multiplicação ===");
        System.out.println("Digite a taboada do numero desejado: ");
        int numero = sc.nextInt();

        // Loop para gerar taboada de 1 a 10

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println("Número: " + i);
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
