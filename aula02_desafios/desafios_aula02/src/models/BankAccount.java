package models;

//criando a classe
public class BankAccount {
    //definindo atributos
    private String accountNumber;
    private double balance;
    public String holder;

    //métodos getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    //métodos setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}
