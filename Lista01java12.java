import java.util.Scanner;

public class Lista01java12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nota1, nota2, nota3, media;
        String nome;
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3) /3;
                if (media < 7 ){
                    System.out.print("Reprovado");

                }
                else {
                    System.out.print("Aprovado");
                    sc.close();
                }


    }
}
