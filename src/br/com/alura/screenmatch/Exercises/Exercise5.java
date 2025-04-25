package br.com.alura.screenmatch.Exercises;

import br.com.alura.screenmatch.model.Movies;

import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(2);

        ArrayList<Shape> listSquares = new ArrayList<>();

        listSquares.add(circle);
        listSquares.add(square);

        for (Shape shape : listSquares){
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
