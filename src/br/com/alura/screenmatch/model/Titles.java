package br.com.alura.screenmatch.model;

public class Titles {

    private String name = "";
    private int releaseYear = 0;
    private boolean includedInPlan = false;
    private double sumRatings = 0;
    private int totalRatings = 0;
    private int durationInMinutes = 0;

    public Titles(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean getIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void showTechnicaSheet() {
        System.out.println("Name of the movie: " + getName());
        System.out.println("Release year: " + getReleaseYear());
        System.out.println("Duration in minutes: " + getDurationInMinutes());
        System.out.println("Included in plan: "+ getIncludedInPlan());
        System.out.println("Total Ratings: " + getTotalRatings());
    }

    public void rate(double evaluation){
        sumRatings += evaluation;
        totalRatings++;
    }

    public double averageRating() {
        return sumRatings / getTotalRatings();
    }
}
