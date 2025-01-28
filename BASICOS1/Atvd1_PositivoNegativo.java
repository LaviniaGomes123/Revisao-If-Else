package BASICOS1;
import java.util.Scanner;
public class Atvd1_PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O numero é negativo");
        }
     sc.close();
    }
}
