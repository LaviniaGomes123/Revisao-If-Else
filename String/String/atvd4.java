package String;

import java.util.Scanner;

public class atvd4 {
    public static void main(String[] args) {
        // Usuario insere uma palavra
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma palavra");
        String palavra = sc.nextLine();

        // verifica a se a quatidade de caracteres é maior que 5
        if (palavra.length() > 5){
            System.out.println("a palavra contem mais de 5 caracteres");
        }else{
            System.out.println("a palavra contem menos de 5 caracteres");
        }
        sc.close();
    }
}
