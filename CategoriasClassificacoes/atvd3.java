package CategoriasClassificacoes;

import java.util.Scanner;

public class atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua altura");
        double altura = sc.nextDouble();
        
        if (altura < 1.60){
            System.out.println("altura baixa");
        } else if (altura >= 1.61 && altura < 1.80) {
            System.out.println("altura media");
        } else if (altura > 1.80) {
            System.out.println("altura alta");
        }
    }
}
