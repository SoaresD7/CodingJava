import java.util.Scanner;

public class Lista01java13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double nota1, nota2, nota3, nota4, media;
        System.out.println("Digite a primeira nota!:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota!:");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota!:");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota!:");
        nota4 = sc.nextDouble();
        media = (nota1+nota2+nota3+nota4) / 4;
        System.out.println(media);
        if (media>=7) {
            System.out.println("Aluno aprovado!");
        } else if (media>=5.1 && media<=6.9){
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
        }








    }

