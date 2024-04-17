package models;

public class PrimeGenerator extends PrimeNumbers {
    public void generateNextPrime (int num) {
        for (int i = num + 1;;i++) {
            if (primalidadeCheck(i)) {
                System.out.println("O próximo número primo é: " + i);
                break;
            }
        }
    }
}
