public class Movie {
    String name = "";
    int releaseYear = 0;
    boolean includedInPlan = false;
    double sumRatings = 0;
    int totalRatings = 0;
    int durationInMinutes = 0;

    void showTechnicaSheet() {
        System.out.println("Name of the movie: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration in minutes: " + durationInMinutes);
        System.out.println("Included in plan: "+ includedInPlan);
        System.out.println("Total Ratings: " + totalRatings);
    }

    void rate(double evaluation){
        sumRatings += evaluation;
        totalRatings++;
    }

    double averageRating() {
        return sumRatings / totalRatings;
    }
}