package introducao_java_oop.ex1.application;

import introducao_java_oop.ex1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler a altura e a largura de um retângulo, em seguida mostrar na tela o valor de sua area, perímetro e diagonal
* */
public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rect.width = sc.nextDouble();
        rect.heigth = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
    }
}
