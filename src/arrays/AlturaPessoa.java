package arrays;

import java.util.Locale;
import java.util.Scanner;

public class AlturaPessoa {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variavel que guarda o tamanho que meu vetor terá.
        int n = sc.nextInt();
        // Variavel que cria o meu vetor e recebe a quantidade de elementos.
        double[] vetor = new double[n];

        // Criação da variavel "i" para fazer a contagem dos elementos
        for (int i=0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i < n; i++) {
            soma += vetor[i];
        }
        double media = soma / n;

        System.out.printf("Media de altura: %.2f%n", media);

        sc.close();

    }
}
