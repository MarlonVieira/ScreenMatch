package br.com.alura.screenmatch.Exercises;

public class ExerciseTitle implements Comparable<ExerciseTitle> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo(ExerciseTitle otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
