package BASICOS1;

public class Atvd9_intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite um numero: ");
        int n = sc.nextInt();

        if (n > 10 && n < 50){
            System.out.println("numero dentro do intervalo");
        }else{
            System.out.println("numero fora do intervalo");
        }
        sc.close();
    }
}
