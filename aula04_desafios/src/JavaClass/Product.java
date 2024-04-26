package JavaClass;

import Interface.Marketable;

import java.util.Scanner;

public class Product implements Marketable {
    Scanner reading = new Scanner(System.in);
    @Override
    public double calculatePrice(double purchasePrice, double discount, double fee) {

        return (purchasePrice - (purchasePrice * (discount / 100) + (purchasePrice * (fee / 100))));
    }
}
