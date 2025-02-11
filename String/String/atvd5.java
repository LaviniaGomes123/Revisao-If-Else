package String;

import java.util.Scanner;

public class atvd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // usuario insere 2 palavras
        System.out.println("digite 2 palavras");
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        //verifica se as palavras sao iguais
        if (p1.equalsIgnoreCase(p2)){
            System.out.println("as palavras sao iguais");
        }else{
            System.out.println("as palavras sao diferentes]");
        }
        sc.close();
    }
}
