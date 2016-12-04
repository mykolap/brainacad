package com.brainacad.module2.lesson17;

/*
Open project called TestThread5. When running the program from lab 2-17-7,
you should see that in some cases it fails to work properly (i.e. the total balance of all the accounts is corrupted).
This is an example of race condition. Modify your code in order to fix these race conditions.
The output should be similar (but not exactly identical) to:
 from: 1 to: 2 amount: 178 Total balance: 5000
 from: 1 to: 0 amount: 30 Total balance: 5000
 from: 1 to: 0 amount: 47 Total balance: 5000 ...
 from: 2 to: 1 amount: 351
 from: 2 to: 4 amount: 27
 Total balance: 5000 from: 2 to: 3 amount: 78
 Total balance: 5000 from: 2 to: 3 amount: 745
  from: 2 to: 2 amount: 5
 */
public class Lab8 {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);

        for (int i = 0; i < N_ACCOUNTS; i++) {
            new Transfer(bank, i, INIT_BALANCE, true).start();
        }
    }
}
