package br.com.alura.screenmatch.Exercises;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();

        bankAccount1.setAcoountNumber(0001);
        bankAccount1.setBalance(5402.32);

        bankAccount2.setAcoountNumber(0002);
        bankAccount2.setBalance(2314.34);

        bankAccount3.setAcoountNumber(0003);
        bankAccount3.setBalance(2426.41);

        bankAccount4.setAcoountNumber(0004);
        bankAccount4.setBalance(7352.25);

        ArrayList<BankAccount> accountsList = new ArrayList<>();
        accountsList.add(bankAccount1);
        accountsList.add(bankAccount2);
        accountsList.add(bankAccount3);
        accountsList.add(bankAccount4);

        BankAccount accountBiggestBalance = accountsList.get(0);
        for (BankAccount bankAccount: accountsList) {
            if (accountBiggestBalance.getBalance() < bankAccount.getBalance()) {
                accountBiggestBalance = bankAccount;
            }
        }
        System.out.println("The account with the biggest balance is: " + accountBiggestBalance.getAcoountNumber() +
                           ", balance: " + accountBiggestBalance.getBalance());
    }
}
