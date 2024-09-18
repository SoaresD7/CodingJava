import java.util.Scanner;

public class While07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.println("Digite um número inteiro!:");
            numero = sc.nextInt();
            if  (numero < 0) {
            }else {
                soma = soma + numero;

            }
        } while (numero >= 0);
        sc.close();
        System.out.println("A soma dos números positivos é: "+soma);



    }

}
