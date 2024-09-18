import java.util.Scanner;

public class Lista01java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double numero, base;
        System.out.println("Digite o número!:");
        numero = sc.nextDouble();
        System.out.println("Digite a base!:");
        base = sc.nextDouble();
        System.out.println("O logaritmo é : "+Math.log(numero) /Math.log(base));




    }
}
