package JavaClass;

import Interface.FinancialConversion;

public class CurrencyConverter implements FinancialConversion {
    double quote = 5.13;

    @Override
    public double convertDollarToReal(double dollar) {
        return dollar * quote;
    }
}