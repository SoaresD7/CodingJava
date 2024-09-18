import java.util.Scanner;

public class ForC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Escreva UMA palavra!: ");
        palavra = sc.nextLine();
        for (int i = 0; i<palavra.length();i++){
            System.out.println(palavra.charAt(i));

        } sc.close();
    }
}
