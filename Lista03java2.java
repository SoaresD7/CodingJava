import java.util.Scanner;

public class Lista03java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDaSemana;
        System.out.println("Digite o número do dia!: ");
        numeroDaSemana = sc.nextInt();
        switch (numeroDaSemana) {
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda-feira");
                break;
            case 3 :
                System.out.println("Terça-feira");
                break;
            case 4 :
                System.out.println("Quarta-feira");
                break;
            case 5 :
                System.out.println("Quinta-feira");
                break;
            case 6 :
                System.out.println("Sexta-feira");
                break;
            case 7 :
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
                break;

        }
    }
}
