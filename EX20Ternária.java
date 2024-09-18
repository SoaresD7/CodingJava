import java.util.Scanner;

public class EX20Ternaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        int temp = scanner.nextInt();

        String clima = (temp <= 18) ? "Clima frio" :
                (temp <= 23) ? "Clima agradável" :
                        (temp <= 35) ? "Clima quente" : "Clima muito quente";

        System.out.println(clima);
    }
}
