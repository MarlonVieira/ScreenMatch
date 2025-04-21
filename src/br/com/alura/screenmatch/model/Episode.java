package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculate.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series serie;
    private int totalVisualizations;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    @Override
    public int getClassification() {
        if (totalVisualizations > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
