package introducao_java_oop.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Estudante {

    String nome;
    Double grade1;
    Double grade2;
    Double grade3;

    public double gradeFinal(){
        return grade1 + grade2 + grade3;
    }

    public double pontosFaltando() {
        if (gradeFinal() < 60.0) {
            return  60.0 - gradeFinal();
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        estudante.nome = sc.nextLine();
        estudante.grade1 = sc.nextDouble();
        estudante.grade2 = sc.nextDouble();
        estudante.grade3 = sc.nextDouble();

        System.out.printf("GRADE FINAL: %.2f%n ", estudante.gradeFinal());

        if (estudante.gradeFinal() < 60.0) {
            System.out.println("REPROVADO!!!");
            System.out.printf("FALTAM: %.2f PONTOS%n", estudante.pontosFaltando());
        } else {
            System.out.println("APROVADO!!!");
        }
        sc.close();
    }

}

