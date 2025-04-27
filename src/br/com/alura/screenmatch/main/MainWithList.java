package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Movies;
import br.com.alura.screenmatch.model.Series;
import br.com.alura.screenmatch.model.Titles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithList {
    public static void main(String[] args) {
        Movies myMovies = new Movies("Pulp Fiction", 1994);
        myMovies.rate(9);
        Movies myOtherMovie = new Movies("Justice League", 2018);
        myOtherMovie.rate(6);
        var momMovie = new Movies("Finding Nemo", 2003);
        momMovie.rate(8);
        Series mySeries = new Series("Lost", 2000);

        Movies m1 = myOtherMovie;

        m1.setName("CLIDE");

        ArrayList<Titles> list = new ArrayList<>();

        list.add(momMovie);
        list.add(myMovies);
        list.add(myOtherMovie);
        list.add(mySeries);

        //list.forEach(System.out::println); //another way to scroll through list

        for (Titles item: list) {
            System.out.println(item);
            if (item instanceof Movies movie && movie.getClassification() > 2) {
                //Movies movie = (Movies) item;
                //System.out.println("Classification: " + ((Movies) item).getClassification());
                System.out.println("Classification: " + movie.getClassification());
            }
        }

        ArrayList<String> searchForArtist = new ArrayList<>();
        searchForArtist.add("Adam Sandler");
        searchForArtist.add("Marlon Vieira");
        searchForArtist.add("Roseli Basse");
        searchForArtist.add("Euclides Olvieira");

        System.out.println(searchForArtist);
        Collections.sort(searchForArtist);
        System.out.println("Sorted: " + searchForArtist);

        Collections.sort(list);
        System.out.println("Sorted titles: " + list);
        list.sort(Comparator.comparing(Titles::getReleaseYear));
        System.out.println("Sorted titles by release year: " + list);
    }
}