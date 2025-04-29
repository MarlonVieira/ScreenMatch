package br.com.alura.screenmatch.challenge;

import java.util.ArrayList;
import java.util.List;

public class Debit implements Card{
    private String number = "";
    private String nameHolder = "";
    private double balance;
    private String flag = "";
    private List<Sales> sales = null;

    public Debit(String number, String nameHolder, String flag, double balance) {
        this.number = number;
        this.nameHolder = nameHolder;
        this.flag = flag;
        this.balance = balance;
        this.sales = new ArrayList<>();
    }

    @Override
    public boolean paySale(Sales sale) {
        if (this.balance >= sale.getValue()) {
            this.balance -= sale.getValue();
            this.sales.add(sale);
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
        System.out.println("\n***********************************************");
        System.out.println("Debit Card:");
        System.out.println("Number: " + number);
        System.out.println("Holder: " + nameHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Flag: " + flag);
        System.out.println("***********************************************\n");
    }

    @Override
    public List<Sales> getSales() {
        return sales;
    }
}