package br.com.alura.screenmatch.model;

public class Series extends Titles {
    private int seasons;
    private int episodesBySeason;
    private boolean active;
    private int minutesByEpisode;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return (minutesByEpisode * episodesBySeason) * seasons;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + "(" + this.getReleaseYear() + ")";
    }
}