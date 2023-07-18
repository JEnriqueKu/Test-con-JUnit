package discountCalculator;

public class DiscountCalculator {

    public static double calcular(double cantidad, double descuento) {
        if (descuento > 25) {
            System.out.println("Descuento no permitido");
            return cantidad;
        } else {
            return cantidad - (cantidad * descuento/100);
        }
    }
}
