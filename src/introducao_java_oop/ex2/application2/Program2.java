package introducao_java_oop.ex2.application2;

import introducao_java_oop.ex2.entities2.Funcionario;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os dados de um funcionario (nome, salário e imposto).
Em seguida, mostrar os dados do funcionario (nome, e salario liquido).
Em seguida aumentar do funcionario  com base em uma porcentagem dada (somente o salario bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionario.*/
public class Program2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário " + func);
        System.out.println();
        System.out.println("Qual a porcentagem de aumento salarial? ");
        double porcentagem = sc.nextDouble();
        func.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados Atualizados: " + func);

        sc.close();
    }
}
