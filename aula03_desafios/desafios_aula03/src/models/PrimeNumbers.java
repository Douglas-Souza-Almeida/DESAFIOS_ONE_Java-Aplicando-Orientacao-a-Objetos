package models;
import java.util.Scanner;

public class PrimeNumbers {
    Scanner reading = new Scanner(System.in);

    public boolean primalidadeCheck(int num1) {
        if (num1 <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void listPrimeNumbers (int limit) {
        System.out.println("< RELAÇÃO DE NÚMERO PRIMOS ATÉ O VALOR INFORMADO >");
        for (int i = 2; i <= limit; i++) {
            if (primalidadeCheck(i)) {
                System.out.println(i);
            }
        }

    }
}
