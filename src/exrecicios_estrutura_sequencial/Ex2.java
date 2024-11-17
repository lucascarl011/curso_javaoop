package exrecicios_estrutura_sequencial;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio2, area, valorPi = 3.14159;

        raio2 = sc.nextDouble();
        area = valorPi * raio2 * raio2;

        System.out.printf("A = %.4f%n", area);
    }
}
