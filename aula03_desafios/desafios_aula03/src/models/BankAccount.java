package models;

public class BankAccount {
    private double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit (double value) {
        accountBalance += value;
    }

    public void withdraw (double value) {
        accountBalance -= value;
    }

    public double check () {
        return accountBalance;
    }
}
