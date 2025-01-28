package BASICOS1;

public class Atvd4_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16 ){
            System.out.println("você não pode votar");
        }else{
            System.out.println("você já pode votar");
        }
        sc.close();
    }
}

