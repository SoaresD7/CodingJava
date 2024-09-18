import java.util.Scanner;
public class lista_while1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();
        int tabuada = 1;
        while (tabuada <= 10) {
            System.out.println(numero + " X " +tabuada + " = " +tabuada * numero);
            tabuada = tabuada + 1;
        }
    }
    }
