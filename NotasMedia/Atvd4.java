package NotasMedia;
import java.util.Scanner;
public class Atvd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite uma nota: ");
        int nota =sc.nextInt();

        if (nota >= 6 && nota < 10) {
            System.out.println("Aluno aprovado, mas não obteve nota máxima.");
        } else if (nota == 10) {
            System.out.println("Aluno aprovado com nota máxima!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
