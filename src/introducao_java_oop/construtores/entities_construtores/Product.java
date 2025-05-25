package introducao_java_oop.construtores.entities_construtores;

public class Product {

    private String name;
    private double price;
    private int quantity;

   /*Sobrecarga*/
    // Construtor Padrão
    public Product(){
    }

    // Construtor Personalizado 1
    public Product(String name, double price, int quantity) {
       this.name = name;
       this.price = price;
       this.quantity = quantity;
    }

    // Construtor personalizado 2
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    /* Encapsulamento */
    // Protegendo os atributos da minha classe com getters e setters.
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
