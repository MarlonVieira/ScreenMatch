import br.com.alura.screenmatch.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("Pulp Fiction");;
        myMovie.setReleaseYear(1994);
        myMovie.setDurationInMinutes(154);
        myMovie.setIncludedInPlan(true);
        myMovie.rate(10);
        myMovie.rate(8.9);
        myMovie.rate(7.8);
        myMovie.showTechnicaSheet();
        System.out.println("The average rating of the movie is: " + myMovie.averageRating());
    }
}