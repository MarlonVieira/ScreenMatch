package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculate.Classifiable;

public class Movies extends Titles implements Classifiable {
    private String director;

    public Movies(String name, int releaseYear) {
        super(name, releaseYear);
    }

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

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear()+")";
    }
}