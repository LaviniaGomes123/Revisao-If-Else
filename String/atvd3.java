package String;
import java.util.Scanner;
public class atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um nome:");
        String nome = sc.nextLine();

        if (nome.startsWith("A")){
            System.out.println("o nome digitado começa com a letra A");
        }else{
            System.out.println("o nome digitado NÃO começa com a letra A");
        }
        sc.close();

    }
}
