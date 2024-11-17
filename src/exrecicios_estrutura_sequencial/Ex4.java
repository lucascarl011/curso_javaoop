package exrecicios_estrutura_sequencial;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario;
        float horasTrabalhadas, valorHora, salario;

        System.out.println("Digite o numero do funcionario: ");
        funcionario = sc.nextInt();
        System.out.println("Digite o valor de horas trabalhadas: ");
        horasTrabalhadas = sc.nextFloat();
        System.out.println("Digite o valor que recebe por hora: ");
        valorHora = sc.nextFloat();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("Funcionario numero: %d%n", funcionario);
        System.out.printf("Salario: R$ %.2f%n", salario);

    }
}
