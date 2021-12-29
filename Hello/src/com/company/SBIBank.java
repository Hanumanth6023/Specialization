package com.company;

public class SBIBank implements Bank {

    private int balance;

    SBIBank(int amount){
        this.balance = amount;

    }

    @Override
    public void withDraw(int amount) {
        if(amount < balance)
            balance = balance - amount;
        else System.out.println("From SBIBank......InSufficient Funds");
    }

    @Override
    public void deposit(int amount) {
        if(amount < 50000)
            balance = balance + amount;
        else System.out.println("From SBIBank...... Not possible to depost");
    }

    @Override
    public void showBalance() {
        System.out.println("From SBIBank...... Availiable Balance ...."+balance);
    }

    public void licPolicy() {
        System.out.println("From SBIBank......licPolicy");
    }

}
