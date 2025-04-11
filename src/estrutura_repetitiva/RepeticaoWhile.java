package estrutura_repetitiva;

import java.util.Scanner;

public class RepeticaoWhile {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = sc.nextInt();

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
