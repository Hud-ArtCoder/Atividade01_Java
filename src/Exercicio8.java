import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        System.out.println(" Classificando do Idade ");
        //Pedindo Numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        // Qual a classificação de idade

        if (idade <= 12) {
            System.out.println("Criança");
        } else if(idade >= 12 && idade <= 18) {
            System.out.println("Adolescente");
        } else if(idade >= 18 && idade <= 60) {
            System.out.println("Adulto");
        } else if( idade <= 60) {
            System.out.println("Idoso");
        }
        sc.close();
    }
}