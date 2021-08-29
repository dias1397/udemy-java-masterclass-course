package com.joaodias.section15.challenge12;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //public synchronized void deposit(double amount) {
    //    balance += amount;
    //}

    //public synchronized void withdraw(double amount) {
    //    balance -= amount;
    //}

    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
            //System.out.println("D " + amount + " : " + balance);
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
            //System.out.println("W " + amount + " : " + balance);
        }
    }
}
