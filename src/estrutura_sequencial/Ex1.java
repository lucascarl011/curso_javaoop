package estrutura_sequencial;

import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextInt();

        resultado = num1 + num2;

        System.out.println("SOMA: " + resultado);
    }
}
