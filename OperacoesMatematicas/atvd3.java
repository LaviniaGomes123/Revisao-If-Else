package OperacoesMatematicas;

import java.util.Scanner;

public class atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //usuario insere 2 numeros
        System.out.println("digite 2 numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        //verifica se um numero e divisivel pelo outro
        if (numero1 % numero2 == 0){
            System.out.println("os numeros sao divisiveis um pelo outro");
        }else{
            System.out.println("os numeros nao sao divisiveis um pelo outro");
        }
        sc.close();
    }
}
