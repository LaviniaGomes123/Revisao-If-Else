package OperacoesMatematicas;

import java.util.Scanner;

public class atvd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  usuário insere um número
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        // Calcula a raiz quadrada do número
        double raiz = Math.sqrt(numero);

        
        // Verifica se a raiz quadrada é um número inteiro
        if (raiz == (int) raiz) {
            System.out.println("O número é um quadrado perfeito.");
        } else {
            System.out.println("O número não é um quadrado perfeito.");
        }
        sc.close();
    }
}

