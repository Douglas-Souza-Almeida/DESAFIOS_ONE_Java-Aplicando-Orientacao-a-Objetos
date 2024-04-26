package JavaClass;

import Interface.Calculable;

public class Book implements Calculable {
    @Override
    public double calculateFinalPrice(double price, double discount, double fees) {
        return price - (price * (discount/100)) + (price * (fees/100));
    }
}
