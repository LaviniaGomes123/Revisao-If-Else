package OperacoesMatematicas;

import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //usuario insere os numeros
        System.out.println("digite 2 numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        //calcula a diferença dos numeros
        int diferenca = numero1 - numero2;

        //verifica se a diferença dos numeros é negativa
        if (diferenca < 0){
            System.out.println(" A diferenca  dos numeros é negativa");
        }else{
            System.out.println("a diferença dos numeros é positiva");
        }
        sc.close();
    }
}
