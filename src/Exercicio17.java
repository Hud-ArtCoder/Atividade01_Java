import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em reais: ");
        int valor = sc.nextInt();

        // calculando a quantidade de notas
        int nota100 = valor / 100;
        valor %= 100;

        int nota50 = valor / 50;
        valor %= 50;

        int nota20 = valor / 20;
        valor %= 20;

        int nota10 = valor / 10;
        valor %= 10;

        int nota5 = valor / 5;
        valor %= 5;

        // Mostra a quantidade de cada nota

        System.out.println("Notas necessárias:");
        System.out.println("R$100: " + nota100);
        System.out.println("R$50: " + nota50);
        System.out.println("R$20: " + nota20);
        System.out.println("R$10: " + nota10);
        System.out.println("R$5: " + nota5);

        if (valor > 0) {
            System.out.println("Valor restante que não pode ser trocado: R$" + valor);
        }
    }
}
