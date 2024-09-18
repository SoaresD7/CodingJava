import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  Anasc, Aatual;

        System.out.println("Em que ano você nasceu?");
        Anasc = sc.nextInt();
        System.out.println("em que ano estamos?");
        Aatual = sc.nextInt();
        sc.close();
        System.out.println("Sua idade atual é: "+(Aatual - Anasc));
        System.out.println("Você terá em 2050: "+(2050 - Anasc) );





    }
}
