package introducao_java_oop.construtores.application_construtores;

import introducao_java_oop.construtores.entities_construtores.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program_construct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Construtor padrão
        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price); // Aqui estamos chamando o construtor personalizado 2. Onde sera lido somente o Nome e o Preço do produto.

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();

        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}