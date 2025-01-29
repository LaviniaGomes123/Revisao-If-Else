package NotasMedia;
import java.util.Scanner;
public class Atvd1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("digite uma nota: ");
            int nota1 = sc.nextInt();
            System.out.println("digite outra nota: ");
            int nota2 = sc.nextInt();
            double media =(nota1 + nota2) / 2;

            System.out.printf("a media é %.2f :",media);
            if (media >=7 ){
                System.out.println("aluno aprovado");
            }else{
                System.out.println("aluno reprovado");
            }
            sc.close();
        }
}
