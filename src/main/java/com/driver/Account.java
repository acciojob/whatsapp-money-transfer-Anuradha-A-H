package com.driver;

public class Account {
	private String accountName;
    public int balance = 1000;

    public Account(String name) {
        this.accountName = name;
    }

    public void sendMoney(Account receiver, int amount) {
    	// your code goes here
        if(balance>amount)
        {
            receiver.receiveMoney(amount);
            balance -=amount;
        }
    }

    public void receiveMoney(int amount) {
        synchronized (this) {
        	// your code goes here
            balance += amount;
        }
    }
}
