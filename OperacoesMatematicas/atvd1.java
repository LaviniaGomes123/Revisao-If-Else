package OperacoesMatematicas;

import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //usuario insere os nuemeros
        System.out.println("insira 2 numeros");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        //soma os numeros que o usuario inseriu
        int sum = number1 + number2;

        //Verifica se a soma é maior que 100
        if (sum > 100){
            System.out.println("a soma dos numeros é maior que 100");
        }else{
            System.out.println("a soma dos numeros é menor que 100");
        }
        sc.close();
    }
}
