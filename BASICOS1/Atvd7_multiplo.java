package BASICOS1;

public class Atvd7_multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite um numero ");
        int n = sc.nextInt();

        if (n % 5 == 0){
            System.out.println(" esse numero e multiplo de 5");
        }else{
            System.out.println("esse numero nao e multiplo de 5");
        }
        sc.close();
    }
}
