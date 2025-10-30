import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println(" Resolvendo as Equações ");
        //Pedindo Numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        // Escolha o modelo de equação
        System.out.println("Escolha qual operador: +, -, * ou /:  ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Adição: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Subtração: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Multiplicação: " + (n1 * n2));
                break;
            case '/':
                System.out.println("Divisão: " + (n1 / n2));
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}