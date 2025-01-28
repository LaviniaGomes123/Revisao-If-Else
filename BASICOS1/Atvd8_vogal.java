package BASICOS1;

public class Atvd8_vogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite uma letra: ");
        char letra = sc.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.printf(" a letra: %s\n e uma vogal ", letra);
        }else{
            System.out.printf("a letra %s\n e uma consoante ", letra);
        }
        sc.close();
    }
}
