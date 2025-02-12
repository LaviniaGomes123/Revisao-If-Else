package CategoriasClassificacoes;

import java.util.Scanner;

public class atvd5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("digite uma temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15){
            System.out.println("frio");
        } else if (temperatura >15 && temperatura <25) {
            System.out.println("agradavel");
        }else {
            System.out.println("quente");
        }
        sc.close();
    }
}
