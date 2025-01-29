package NotasMedia;
import java.util.Scanner;
public class Atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite a nota do aluno: ");
        int nota = sc.nextInt();

        if (nota < 5){
            System.out.println("Reprovado");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Recuparação");
        }else if (nota > 7){
            System.out.println("Aprovado");
        }
    }

}
