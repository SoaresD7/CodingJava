import java.util.Scanner;

public class Lista02java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double numero;
        System.out.println("Digite um número!: ");
        numero = sc.nextDouble();

        if (numero>0) {
            System.out.println("Número positivo!");
        } else if (numero<0){
            System.out.println("Número negativo!");
        }
        else {
            System.out.println("Número nulo!");
        }

    }
}
