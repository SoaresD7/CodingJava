import java.util.Scanner;

public class VetorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] assento = new int[30];
        boolean [] estadoreserva = new boolean[30];
        int opt = 3;
        while (opt!=0) {
            System.out.println("MENU DE RESERVAS");
            System.out.println();
            System.out.println("1. Reservar mesas");
            System.out.println();
            System.out.println("0. Sair");
            opt = sc.nextInt();
            switch (opt) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    System.out.println("RESERVA DE MESA");
                    System.out.println();
                    System.out.println("Insira o numero da mesa a ser reseervado(100-129): ");
                    int n = sc.nextInt();
                    System.out.println();
                    n = n - 100;
                    if (estadoreserva[n]==false) {
                        System.out.println("Insira a quantidade de assenstos necessarios(1-5): ");
                        assento[n] = sc.nextInt();
                        estadoreserva[n] = true;
                    } else {
                        System.out.println("A mesa já está reservada. ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção invalida!");

            }
        }
    }
}
