package BASICOS1;

public class atvd5_Maiorde3Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite o n1: ");
        int n1 = sc.nextInt();
        System.out.println("digite o n2: ");
        int n2 = sc.nextInt();
        System.out.println("digite o n3: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1>n3){
            System.out.println("o n1 e o maior numero");
        }else if (n2 > n1 && n2 > n3){
            System.out.println("n2 e o maior numero");
        }else if (n3 > n1 && n3 > n2){
            System.out.println("n3 eo maior numero");
        }
        sc.close();
    }
}
}
