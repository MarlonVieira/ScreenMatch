package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculate.CalculateTime;
import br.com.alura.screenmatch.calculate.Filter;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movies;
import br.com.alura.screenmatch.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movies myMovies = new Movies("Pulp Fiction", 1994);

        //myMovies.setName("Pulp Fiction");
        //myMovies.setReleaseYear(1994);
        myMovies.setDurationInMinutes(154);
        myMovies.setIncludedInPlan(true);
        myMovies.rate(10);
        myMovies.rate(8.9);
        myMovies.rate(7.8);
        //myMovies.showTechnicaSheet();
        System.out.println("The average rating of the movie is: " + myMovies.averageRating());

        Series mySeries = new Series("Lost", 2000);
        //mySeries.setName("Lost");
        //mySeries.setReleaseYear(2000);
        mySeries.setSeasons(10);
        mySeries.setEpisodesBySeason(7);
        mySeries.setMinutesByEpisode(65);
        //mySeries.showTechnicaSheet();

        Movies myOtherMovie = new Movies("Justice League", 2018);
        //myOtherMovie.setName("Justice League");
        //myOtherMovie.setReleaseYear(2018);
        myOtherMovie.setDurationInMinutes(195);

        CalculateTime calculate =  new CalculateTime();
        calculate.include(myMovies);
        calculate.include(myOtherMovie);
        calculate.include(mySeries);
        System.out.println(calculate.getTotalTime());

        Filter filter = new Filter();
        filter.filtering(myMovies);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(mySeries);
        episode.setTotalVisualizations(400);
        filter.filtering(episode);

        var momMovie = new Movies("Finding Nemo", 2003);
        //momMovie.setName("Finding Nemo");
        //momMovie.setReleaseYear(2003);
        momMovie.setDirector("Andrew Stanton");
        momMovie.setIncludedInPlan(true);
        momMovie.setDurationInMinutes(100);
        momMovie.rate(10);

        ArrayList<Movies> moviesList = new ArrayList<>();

        moviesList.add(momMovie);
        moviesList.add(myMovies);
        moviesList.add(myOtherMovie);

        System.out.println("List size: " + moviesList.size());
        System.out.println("Fist movie: " + moviesList.get(0).getName());
        System.out.println(moviesList.toString());
        System.out.println(moviesList.get(0).toString());
    }
}