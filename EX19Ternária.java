import java.util.Scanner;
public class Lista02java19_ternario {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Digite o valor de x: ");
        sc.nextInt();
        String Mensagem = (x % 5 == 0) ? "é múltiplo de 5" : "não é múltiplo de 5";
        System.out.println(Mensagem);
        sc.close();
        }
    }

