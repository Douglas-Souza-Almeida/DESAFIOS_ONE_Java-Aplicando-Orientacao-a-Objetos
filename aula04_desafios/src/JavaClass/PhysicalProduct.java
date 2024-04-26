package JavaClass;

import Interface.Calculable;

public class PhysicalProduct implements Calculable {
    @Override
    public double calculateFinalPrice(double value, double discount, double fees) {
        return value - (value * (discount/100)) + (value * (fees/100));
    }
}
