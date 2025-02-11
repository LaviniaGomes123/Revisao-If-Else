package CategoriasClassificacoes;

import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //usuario insere sua idade
        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();

        //verifica se é crianca adolescente adulto ou idoso
        if (idade < 12){
            System.out.println("criança");
        }else if (idade >= 12 && idade < 18){
            System.out.println("adolescente");
        }else if (idade >= 18 && idade < 60){
            System.out.println("adulto");
        } else if (idade > 60 && idade < 100) {
            System.out.println("idoso");
        } else if (idade >= 100) {
            System.out.println("Veterano imortal, Rainha Elizabeth 2.0, morre nunca");
        }
        sc.close();

    }
}
