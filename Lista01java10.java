package DAVI_JAVA;

import java.util.Scanner;

public class Lista01java10 {


        public static void main(String[] args) { new Scanner("switch");
            // Criando um objeto Scanner para receber entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicitando e lendo a distância total percorrida
            System.out.print("Digite a distância total percorrida (em quilômetros): ");
            double distanciaPercorrida = scanner.nextDouble();

            // Solicitando e lendo o total de combustível gasto
            System.out.print("Digite o total de combustível gasto (em litros): ");
            double combustivelGasto = scanner.nextDouble();

            // Calculando o consumo médio
            double consumoMedio = distanciaPercorrida / combustivelGasto;

            // Mostrando o consumo médio
            System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");

            // Fechando o Scanner
            scanner.close();
        }
    }


