package CategoriasClassificacoes;

import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero:");
        int numero = sc.nextInt();

        if (numero >=1 && numero <=10){
            System.out.println("categoria A");
        }else if (numero >= 11 && numero <= 20){
            System.out.println("categoria B");
        }else if (numero >= 21 && numero <= 30) {
            System.out.println("categoria C");
        }
        sc.close();
    }
}
