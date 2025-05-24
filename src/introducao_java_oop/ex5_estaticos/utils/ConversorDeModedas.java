package introducao_java_oop.ex5_estaticos.utils;

public class ConversorDeModedas {

    public static final double IOF = 0.06;

    public static double converteDolarParaReal (double precoDolar, double quantidadeDolares) {
        double valorSemIOF = precoDolar * quantidadeDolares;
        double valorComIOF = valorSemIOF * (1.0 + IOF);
        return valorComIOF;
    }
}
