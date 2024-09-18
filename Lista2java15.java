import java.util.Scanner;

public class Lista02java15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        System.out.println("Digite o valor de x:");
        x = scanner.nextInt();
        System.out.print("Digite o valor de y:");
        y = scanner.nextInt();

        if(x>y)
        System.out.println("O maior valor é:" + x);
        else if(x<y)
            System.out.println("O maior valor é:" + y);




    }
}
