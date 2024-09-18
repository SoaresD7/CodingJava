import java.util.Scanner;

public class Lista04_18 {
    static int[][] dadosPorResidencia = new int[100][4];
    static int numResidencias = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch(opcao) {
                case 1:
                    armazenarDados(scanner);
                    break;
                case 2:
                    quantidadeEleitoresPorFaixaEtaria();
                    break;
                case 3:
                    faixaMenorEleitores();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu");
        System.out.println("1 – Armazenamento de todos os dados");
        System.out.println("2 – Quantidade de eleitores por faixa etária");
        System.out.println("3 – Faixa com o menor número de eleitores");
        System.out.println("4 – Sair");
        System.out.print("Opção: ");
    }

    public static void armazenarDados(Scanner scanner) {
        if (numResidencias >= 100) {
            System.out.println("Limite de residências atingido (limite: 100).");
            return;
        }

        System.out.print("Número da residência: ");
        int numeroResidencia = scanner.nextInt();

        System.out.print("Quantidade de eleitores na faixa 1 (até 20 anos): ");
        int faixa1 = scanner.nextInt();

        System.out.print("Quantidade de eleitores na faixa 2 (21 a 40 anos): ");
        int faixa2 = scanner.nextInt();

        System.out.print("Quantidade de eleitores na faixa 3 (41 a 60 anos): ");
        int faixa3 = scanner.nextInt();

        System.out.print("Quantidade de eleitores na faixa 4 (mais de 60 anos): ");
        int faixa4 = scanner.nextInt();

        // Armazenar os dados na matriz
        dadosPorResidencia[numResidencias][0] = faixa1;
        dadosPorResidencia[numResidencias][1] = faixa2;
        dadosPorResidencia[numResidencias][2] = faixa3;
        dadosPorResidencia[numResidencias][3] = faixa4;

        numResidencias++;

        System.out.println("Dados armazenados com sucesso.");
    }
    public static void quantidadeEleitoresPorFaixaEtaria() {
        int totalFaixa1 = 0, totalFaixa2 = 0, totalFaixa3 = 0, totalFaixa4 = 0;

        for (int i = 0; i < numResidencias; i++) {
            totalFaixa1 += dadosPorResidencia[i][0]; // faixa 1
            totalFaixa2 += dadosPorResidencia[i][1]; // faixa 2
            totalFaixa3 += dadosPorResidencia[i][2]; // faixa 3
            totalFaixa4 += dadosPorResidencia[i][3]; // faixa 4
        }

        System.out.println("Quantidade de eleitores por faixa etária:");
        System.out.println("Faixa 1 (até 20 anos): " + totalFaixa1);
        System.out.println("Faixa 2 (21 a 40 anos): " + totalFaixa2);
        System.out.println("Faixa 3 (41 a 60 anos): " + totalFaixa3);
        System.out.println("Faixa 4 (mais de 60 anos): " + totalFaixa4);
    }

    public static void faixaMenorEleitores() {
        int menorNumeroEleitores = Integer.MAX_VALUE;
        int residenciaMenor = -1;

        for (int i = 0; i < numResidencias; i++) {
            int totalEleitores = dadosPorResidencia[i][0] + dadosPorResidencia[i][1] +
                    dadosPorResidencia[i][2] + dadosPorResidencia[i][3];

            if (totalEleitores < menorNumeroEleitores) {
                menorNumeroEleitores = totalEleitores;
                residenciaMenor = i + 1; // número da residência
            }
        }

        if (residenciaMenor != -1) {
            System.out.println("Faixa com o menor número de eleitores: Residência " + residenciaMenor);
        } else {
            System.out.println("Nenhuma residência cadastrada.");
        }
    }
}
