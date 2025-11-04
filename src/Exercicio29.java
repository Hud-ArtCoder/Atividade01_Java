import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if (senha.length() >= 6) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida. A senha deve ter pelo menos 6 caracteres.");
        }
    }
}

