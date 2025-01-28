package BASICOS1;

public class Atvd3_MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("digite outro numero: ");
        int n2 = sc.nextInt();

        if (n1 > n2 ){
            System.out.println("n1 'e o maior numero ");
        }else{
            System.out.println("n2 'e o maior numero");
        }
        sc.close();
    }
}
