import java.util.Arrays;
import java.util.Scanner;

public class VetorF {
    public static void main(String[] args) {
        Integer [] numeros = {2, 4, 6, 8};
        Arrays.sort(numeros);
        for (int cont = 0; cont < numeros.length;cont++){
            System.out.println(numeros[cont] + " ");
        }

    }
}


