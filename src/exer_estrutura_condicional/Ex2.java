package exer_estrutura_condicional;

//
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Ex2 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
