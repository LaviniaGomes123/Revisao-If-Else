package NotasMedia;
import java.util.Scanner;
public class Atvd3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite a nota 1: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        int nota2 = sc.nextInt();
        System.out.println("Digte a nota 3: ");
        int nota3 = sc.nextInt();

        if (nota1 > nota2 && nota1 > nota3 && nota2 < nota3){
            System.out.printf("%d é a maior nota e %d é a menor nota", nota1, nota2);
        }else if(nota1 > nota2 && nota1 > nota3 && nota3 < nota2){
            System.out.printf("%d é a maior nota e %d é a menor nota", nota1, nota3);
        }else if(nota2 > nota1 && nota2 > nota3 && nota1 < nota3){
            System.out.printf("%d é a maior nota e %d é a menor nota", nota2, nota1);
        }else if(nota2 > nota1 && nota2 > nota3 && nota3 < nota1) {
            System.out.printf("%d é a maior nota e %d é a menor nota", nota2, nota3);
        }else if(nota3 > nota1 && nota3 > nota2 && nota1 < nota2) {
            System.out.printf("%d é a maior nota e %d é a menor nota", nota3, nota1);
        }else if(nota3 > nota1 && nota3 > nota2 && nota2 < nota1) {
            System.out.printf("%d é a maior nota e %d é a menor nota", nota3, nota2);
        }
        sc.close();

    }
}
