import java.util.Scanner;

public class WhileD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1,x;
        System.out.println("Digite a senha: ");
        s1 = sc.nextInt();
        x = 1234;

        while (x !=s1){

            System.out.println("Senha incorreta: ");
            s1 = sc.nextInt();

        }
        System.out.println(s1);
        sc.close();
    }
}
