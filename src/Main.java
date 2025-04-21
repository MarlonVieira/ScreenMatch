import br.com.alura.screenmatch.calculate.CalculateTime;
import br.com.alura.screenmatch.calculate.Filter;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movies;
import br.com.alura.screenmatch.model.Series;

public class Main {
    public static void main(String[] args) {
        Movies myMovies = new Movies();

        myMovies.setName("Pulp Fiction");
        myMovies.setReleaseYear(1994);
        myMovies.setDurationInMinutes(154);
        myMovies.setIncludedInPlan(true);
        myMovies.rate(10);
        myMovies.rate(8.9);
        myMovies.rate(7.8);
        myMovies.showTechnicaSheet();
        System.out.println("The average rating of the movie is: " + myMovies.averageRating());

        Series mySeries = new Series();
        mySeries.setName("Lost");
        mySeries.setReleaseYear(2000);
        mySeries.setSeasons(10);
        mySeries.setEpisodesBySeason(7);
        mySeries.setMinutesByEpisode(65);
        mySeries.showTechnicaSheet();

        Movies myOtherMovie = new Movies();
        myOtherMovie.setName("Justice League");
        myOtherMovie.setReleaseYear(2018);
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
    }
}