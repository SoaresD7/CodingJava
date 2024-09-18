import java.util.Scanner;

public class ArrayH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Mercadoria" + i);
            System.out.println("Digite o preço de Compra: ");
            double precoCompra = scanner.nextDouble();
            System.out.println("Digite o preço de Venda: ");
            double precoVenda = scanner.nextDouble();

            double lucro = (precoVenda - precoCompra) / precoCompra * 100;

            if (lucro < 10) {
                lucroMenor10++;
            } else if (lucro >= 10 && lucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }

        System.out.println("Mercadorias com o lucro menor que 10%:  "+ lucroMenor10);
        System.out.println("Mercadorias com o lucro entre 10% e 20%: "+ lucroEntre10e20);
        System.out.println("Mercadorias com o lucro acima de 20%: "+ lucroMaior20);

        scanner.close();


    }

}
