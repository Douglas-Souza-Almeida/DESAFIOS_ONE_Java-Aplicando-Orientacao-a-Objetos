package JavaClass;

import Interface.Table;

public class MultiplicationTable implements Table {
    @Override
    public double showMultiplicationTable(double number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%.2f X %d = %.2f", number, i, number*i));
        }
        return 0;
    }
}
