package com.brainacad.module2.lesson17;

public class Transfer extends Thread {
    private Bank bank;
    private int from;
    private int max;
    private boolean syncMode;

    public Transfer(Bank bank, int from, int max_amount, boolean syncMode) {
        this.bank = bank;
        this.from = from;
        this.max = max_amount;
        this.syncMode = syncMode;
    }

    @Override
    public void run() {
        while (true) {
            int to = (int) (Math.random() * bank.getNumberAccounts());
            int ss = (int) (Math.random() * max) + 1;
            bank.transfer(from, to, ss, syncMode);
        }
    }
}
