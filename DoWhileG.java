import java.util.Random;

public class DoWhileG {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroGerado;
        int contador = 0;

        do {
            numeroGerado = random.nextInt(100) + 1;
            contador++;
            System.out.println("Número gerado: " + numeroGerado);
        } while (numeroGerado != 50);
        System.out.println("O número 50 foi gerado após " + contador + " tentativas.");
    }

    }
