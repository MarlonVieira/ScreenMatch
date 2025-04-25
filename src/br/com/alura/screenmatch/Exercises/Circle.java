package br.com.alura.screenmatch.Exercises;

public class Circle implements Shape{
    private double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    @Override
    public double calculateArea() {
        return  Math.PI * (ray * ray);
    }
}