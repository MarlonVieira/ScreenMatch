package br.com.alura.screenmatch.challenge;

public class Credit implements Card{
    private String number;
    private String nameHolder;
    private double limit;
    private double balanceUsed;
    private String flag;

    public Credit(String number, String nameHolder, double limit, String flag) {
        this.number = number;
        this.nameHolder = nameHolder;
        this.limit = limit;
        this.balanceUsed = 0;
        this.flag = flag;
    }

    @Override
    public boolean pay(double value) {
        if (balanceUsed + value <= limit) {
            balanceUsed += value;
            return true;
        }
        return false;
    }

    @Override
    public double checkBalance() {
        return limit - balanceUsed;
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
        System.out.println("Credit Card:");
        System.out.println("Number: " + number);
        System.out.println("Holder: " + nameHolder);
        System.out.println("Limit: " + limit);
        System.out.println("Flag: " + flag);
        System.out.println("***********************************************");
    }
}
