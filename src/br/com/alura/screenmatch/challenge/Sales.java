package br.com.alura.screenmatch.challenge;

public class Sales {

    private String product;
    private double value;

    public Sales(String product, double value) {
        this.product = product;
        this.value = value;
    }  

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sale: product: " + product +
                " Value: " + value;
    }
}