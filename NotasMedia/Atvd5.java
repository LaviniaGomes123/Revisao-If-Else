package NotasMedia;
import java.util.Scanner;
public class Atvd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite uma nota:");
        int n1 = sc.nextInt();
        System.out.println("digite outra nota: ");
        int n2 = sc.nextInt();

        if (n1 >=10 && n2 >=10){
            System.out.println("n1 aprovado");
            System.out.println("n2 aprovado");
        }else if (n1 >=10 && n2 <10){
            System.out.println("n1 aprovado");
            System.out.println("n2 reprovado");
        }else if (n1 <10 && n2 >=10){
            System.out.println("n1 reprovado");
            System.out.println("n2 aprovado");
        }else if (n1 <10 && n2 <10){
            System.out.println("n1 reprovado");
            System.out.println("n2 reprovado");
        }
    }
}
