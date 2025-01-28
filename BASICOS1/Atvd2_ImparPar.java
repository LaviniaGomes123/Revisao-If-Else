package BASICOS1;
import java.util.Scanner;
public class Atvd2_ImparPar {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("digite um numero: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0 ){
                System.out.println("numero par");
            }else{
                System.out.println("numero impar");
            }
        }
    }
