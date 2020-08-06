package org.xpdojo.bank;

public class Account {

    private int balance = 0;

   public int Balance()
    {
        return balance;
    }

    public void deposit(int amount)
    {
        balance+= amount;
    }
}
