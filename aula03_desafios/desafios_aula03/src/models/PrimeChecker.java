package models;


public class PrimeChecker extends PrimeNumbers {
    public void primeChecker (int num) {
        if (primalidadeCheck(num)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
