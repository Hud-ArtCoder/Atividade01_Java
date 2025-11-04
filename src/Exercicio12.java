import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] notas = new int[3];

        // Pedindo as notas
        for (int i = 0; i < notas.length; i ++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = sc.nextInt();
        }
        // Calculo da Média
        double soma = 0;
        for(int n : notas){
            soma += n;
        }
        double media = soma / (double) notas.length;

        // informando se o aluno passou

        if (media >= 7) {
            System.out.println("Aluno Aprovado:");
        } else {
            System.out.println("Aluno Reprovado:");
        }
        sc.close();

    }
}
