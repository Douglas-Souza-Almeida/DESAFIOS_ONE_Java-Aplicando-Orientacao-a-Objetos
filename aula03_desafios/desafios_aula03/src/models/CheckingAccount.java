package models;

public class CheckingAccount extends BankAccount {
    public void serviceFee (double value) {
        double balance = getAccountBalance() - value;

        setAccountBalance(balance);

    }



}
