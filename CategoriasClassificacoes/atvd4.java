package CategoriasClassificacoes;

import java.util.Scanner;

public class atvd4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar os valores da pressão arterial
        System.out.print("Digite a pressão sistólica: ");
        int sistolica = sc.nextInt();

        System.out.print("Digite a pressão diastólica: ");
        int diastolica = sc.nextInt();

        //verifica o risco
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("normal");
        } else if ((sistolica >= 130 && sistolica < 140) || (diastolica >= 80 && diastolica < 90)) {
            System.out.println("moderado");
        } else if (sistolica >= 140 || diastolica >= 90) {
            System.out.println("alta");
        } else {
            System.out.println("Valor invalido");
        }
        sc.close();
    }
}





