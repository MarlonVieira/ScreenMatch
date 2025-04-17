public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Pulp Fiction";
        myMovie.releaseYear = 1994;
        myMovie.durationInMinutes = 154;
        myMovie.includedInPlan = true;
        myMovie.rate(10);
        myMovie.rate(8.9);
        myMovie.rate(7.8);
        myMovie.showTechnicaSheet();
        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.sumRatings);
        System.out.println("The average rating of the movie is: " + myMovie.averageRating());
    }
}