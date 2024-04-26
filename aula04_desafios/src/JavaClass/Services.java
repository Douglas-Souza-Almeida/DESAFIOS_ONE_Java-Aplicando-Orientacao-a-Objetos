package JavaClass;

import Interface.Marketable;

public class Services implements Marketable {
    @Override
    public double calculatePrice(double purchasePrice, double discount, double fee) {
        return purchasePrice - (purchasePrice * (discount / 100) + (purchasePrice * (fee / 100)));
    }
}
