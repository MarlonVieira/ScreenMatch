package br.com.alura.screenmatch.calculate;

import br.com.alura.screenmatch.model.Titles;

public class CalculateTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Titles title) {
        totalTime += title.getDurationInMinutes();
    }
}
