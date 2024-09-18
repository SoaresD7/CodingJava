import java.util.Scanner;

public class WhileC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int x = sc.nextInt();

        while (x != 0) {
            x = sc.nextInt();
            soma = soma + x;
            x = sc.nextInt();
        }


            System.out.println(soma);

            sc.close();




    }
}
