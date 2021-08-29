package com.joaodias.section15.challenge67;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345-678", 1000.00);

        new Thread(() -> {
            account.deposit(300.00);
            account.withdraw(50.00);
        }).start();

        new Thread(() -> {
            account.deposit(203.75);
            account.withdraw(100.00);
        }).start();
    }

}
