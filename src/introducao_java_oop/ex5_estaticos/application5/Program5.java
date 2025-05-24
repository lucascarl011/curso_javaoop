package introducao_java_oop.ex5_estaticos.application5;

import introducao_java_oop.ex5_estaticos.utils.ConversorDeModedas;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares para ser comprado por uma pessoas em reais.
Informar quantos reais a pessoa vai pagar pelos dólares,
considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
* */

public class Program5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual o valor do dólar? ");
        double precoDolar = sc.nextDouble();
        System.out.printf("Quantos dólares serão comprados? ");
        double quantidadeDolares = sc.nextDouble();

        double valorEmReais = ConversorDeModedas.converteDolarParaReal(precoDolar, quantidadeDolares);

        System.out.printf("Valor a ser pago em reais = %.2f%n", valorEmReais);

        sc.close();
    }

}
