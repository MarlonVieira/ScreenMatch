package br.com.alura.screenmatch.challenge;

public interface Card {
    boolean pay(double value);
    double checkBalance();
    String getNumber();
    String getNameHolder();
    void showAccountDetails();
}
