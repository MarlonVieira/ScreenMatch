package br.com.alura.screenmatch.challenge;

import java.util.List;

public interface Card {
    boolean paySale(Sales sales);
    double checkBalance();
    String getNumber();
    String getNameHolder();
    void showAccountDetails();
    List<Sales> getSales();
}