package arrays.application;

import arrays.entities.ArrayProduto;

import java.util.Locale;
import java.util.Scanner;

public class ArrayProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayProduto[] vetor = new ArrayProduto[n];

        for (int i=0; i < n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new ArrayProduto(nome, preco);
        }

        double soma = 0.0;
        for (int i=0; i < n; i++) {
            soma += vetor[i].getPreco();
        }
        double media = soma / n;
        System.out.printf("PREÇO MÉDIO = %.2f%n", media);

        sc.close();
    }
}
