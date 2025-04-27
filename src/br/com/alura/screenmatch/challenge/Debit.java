package br.com.alura.screenmatch.challenge;

public class Debit implements Card{
    private String number;
    private String nameHolder;
    private double balance;
    private String flag;

    public Debit(String number, String nameHolder, String flag, double balance) {
        this.number = number;
        this.nameHolder = nameHolder;
        this.flag = flag;
        this.balance = balance;
    }

    @Override
    public boolean pay(double value) {
        if (balance >= value) {
            balance -= value;
            return true;
        }
        return false;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getNameHolder() {
        return nameHolder;
    }

    @Override
    public void showAccountDetails() {
        System.out.println("***********************************************");
        System.out.println("Debit Card:");
        System.out.println("Number: " + number);
        System.out.println("Holder: " + nameHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Flag: " + flag);
        System.out.println("***********************************************");
    }
}
