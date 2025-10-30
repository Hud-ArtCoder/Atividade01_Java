import java.util.Scanner;

public class Exercicio4 {
        public static void main(String[] args) {
            System.out.println(" Resolvendo as Equações ");
            //Pedindo Numeros
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int numero1 = sc.nextInt();
            System.out.println("Digite outro número: ");
            int numero2 = sc.nextInt();

        //Realizando Equações

            System.out.println("Subtração: " + (numero1 - numero2));
            System.out.println("Multiplicação: " + (numero1 * numero2));
            System.out.println("Divisão: " + (numero1 / numero2));
        }
}
