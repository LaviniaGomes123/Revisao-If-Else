package OperacoesMatematicas;

import java.util.Scanner;

public class atvd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //usuario insere 3 numeros
        System.out.println("digite 3 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //verifica se os numeros podem formar um triangulo
        if (a+b >c && a+c >b && b+c >a){
            System.out.println("os numeros podem formar um triangulo");
        }else{
            System.out.println("os numeros nao podem formar um triangulo");
        }
        sc.close();

    }
}
