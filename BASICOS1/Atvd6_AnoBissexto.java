package BASICOS1;

public class Atvd6_AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite o ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 ==0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("esse é um ano bissexto");
        }else{
            System.out.println("esse nao e um ano bissexto");
        }
        sc.close();
    }
}

