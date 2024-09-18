import java.util.Scanner;

public class Lista04_16 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int numDelegacoes = 5;
            int numAtletasPorDelegacao = 10;


            double[][] alturas = new double[numDelegacoes][numAtletasPorDelegacao];


            for (int i = 0; i < numDelegacoes; i++) {
                System.out.println("Delegação " + (i + 1) + ":");
                for (int j = 0; j < numAtletasPorDelegacao; j++) {
                    System.out.printf("Altura do Atleta %d: ", (j + 1));
                    alturas[i][j] = scanner.nextDouble();
                }
            }


            System.out.println("\nMaior altura de cada delegação:");

            for (int i = 0; i < numDelegacoes; i++) {
                double maiorAltura = alturas[i][0];
                for (int j = 1; j < numAtletasPorDelegacao; j++) {
                    if (alturas[i][j] > maiorAltura) {
                        maiorAltura = alturas[i][j];
                    }
                }
                System.out.println("Delegação " + (i + 1) + ": " + maiorAltura + " metros");
            }

            scanner.close();
        }
    }


