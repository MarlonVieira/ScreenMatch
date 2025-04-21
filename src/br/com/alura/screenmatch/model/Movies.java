package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculate.Classifiable;

public class Movies extends Titles implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) super.averageRating() / 2;
    }
}