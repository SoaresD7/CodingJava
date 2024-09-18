import java.util.Scanner;

public class ForD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0 ;
        System.out.println("Digite um número inteiro positivo!: ");
        numero = sc.nextInt();
        for(int i = 1; i <= numero; i++){
            soma = soma + i;


        }
        System.out.println("A soma dos números entre 1 e o número digitado é: "+soma);
        sc.close();
    }
}
