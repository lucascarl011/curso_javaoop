package introducao_java_oop.exercicio_ope_bancaria.apllication_bank;

import introducao_java_oop.exercicio_ope_bancaria.entities_bank.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o nome do titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Deseja fazer um depósito inicial? Reponda (y/n)");
        char resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.println("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados Atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados Atualizados: ");
        System.out.println(conta);

        sc.close();
    }
}
