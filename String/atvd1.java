package String;
import java.util.Scanner;
public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sim ou nao: ");
        String palavra = sc.nextLine();
        if (palavra.equalsIgnoreCase("Sim")) {
             System.out.println("voce escreveu sim");
         }else if (palavra.equalsIgnoreCase("não")) {
             System.out.println("voce escreveu nao");
         }else{
            System.out.println("resposta invalida");
        }
        sc.close();

    }
}
