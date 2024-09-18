package DAVI_JAVA;

import java.util.Scanner;
public class VetorG {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] nomes = new String[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome " + (i + 1) + ": ");
                nomes[i] = scanner.nextLine();
            }

            for (int i = 0; i < nomes.length - 1; i++) {
                int menorIndice = i;
                for (int j = i + 1; j < nomes.length; j++) {
                    if (nomes[j].compareToIgnoreCase(nomes[menorIndice]) < 0) {
                        menorIndice = j;
                    }
                }
                String temp = nomes[menorIndice];
                nomes[menorIndice] = nomes[i];
                nomes[i] = temp;
            }

            System.out.println("Nomes ordenados:");
            for (String nome : nomes) {
                System.out.println(nome);
            }

            scanner.close();
        }
    }
