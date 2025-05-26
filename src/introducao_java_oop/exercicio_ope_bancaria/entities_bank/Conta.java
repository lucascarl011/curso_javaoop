package introducao_java_oop.exercicio_ope_bancaria.entities_bank;

public class Conta {

    private final double TAX = 5.00;

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getConta() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDeposito) {
       saldo += valorDeposito;
    }

    public void saque(double valorSaque) {
        saldo -= valorSaque + TAX;
    }

    public String toString() {
        return "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }

}
