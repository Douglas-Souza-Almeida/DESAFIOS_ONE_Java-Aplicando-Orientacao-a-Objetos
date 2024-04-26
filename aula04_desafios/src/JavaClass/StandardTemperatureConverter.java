package JavaClass;

import Interface.TemperatureConverter;

public class StandardTemperatureConverter implements TemperatureConverter {
    @Override
    public double celsiusToFahrenheit(double celsius) {
        return ((9.0 / 5.0) * celsius) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}
