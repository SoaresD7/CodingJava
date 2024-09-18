import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n1, n2;
         int resul;


        System.out.println("Digite o primeiro numero:");
        n1 = sc.nextInt();
        System.out.println("digite outro numero:");
        n2 = sc.nextInt();

        System.out.println(n1 + "^" + n2 + (Math.pow(n1, n2)));

        sc.close();


    }
}
