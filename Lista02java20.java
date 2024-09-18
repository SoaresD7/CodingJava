import java.util.Scanner;
public class Lista02java20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        int temp = scanner.nextInt();

        if (temp <= 18) {
            System.out.println("Clima frio");
        } else if (temp > 18 && temp <= 23) {
            System.out.println("Clima agradável");
        } else if (temp > 23 && temp <= 35) {
            System.out.println("Clima quente");
        } else {
            System.out.println("Clima muito quente");
        }
    }
}

