package Lista02JAVA;

import java.util.Scanner;

public class exercicios21 {

    public static void main(String[] args) {
     Scanner salarios = new Scanner(System.in);
     Double salarioMinimo;
        System.out.println("Digite seu salario");
        salarioMinimo = salarios.nextDouble();
        System.out.println(( salarioMinimo <=654 ) ? "Ate 1 salario minimo:" :
                        (salarioMinimo <= 1935) ? "Ate 3 salarios minimos" :
                                (salarioMinimo <= 3225) ? "Ate 5 salarios minimos" : "Acima de 5 salarios minimos");
    }
}
