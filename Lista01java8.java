import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        double PesoAtual,engordar,emagrecer;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu peso atual? :");
        PesoAtual = sc.nextDouble();
        engordar = (PesoAtual * 15 ) / 100 + PesoAtual;
        System.out.println("Voce engordando: " + engordar);
        emagrecer = (PesoAtual * 20 ) / 100 - PesoAtual;
        System.out.println("Voce emagrecendo: " + emagrecer);
    }
}