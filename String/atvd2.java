package String;
import java.sql.SQLOutput;
import java.util.Scanner;
public class atvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a senha: ");
        String senha = sc.nextLine();

        if (senha.equals("aluno123")){
            System.out.println("Bem vindo!");
        }else{
            System.out.println("senha incorreta!");
        }
        sc.close();
    }
}
