package br.com.alura.screenmatch.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8Title {
    public static void main(String[] args) {
        ExerciseTitle title1 = new ExerciseTitle();
        ExerciseTitle title2 = new ExerciseTitle();
        ExerciseTitle title3 = new ExerciseTitle();
        ExerciseTitle title4 = new ExerciseTitle();

        title1.setName("Kung Fu: Panda");
        title2.setName("Moana");
        title3.setName("Toy Story");
        title4.setName("Minecraft: The Movie");

        List listTitles = new ArrayList();
        listTitles.add(title1);
        listTitles.add(title2);
        listTitles.add(title3);
        listTitles.add(title4);

        System.out.println(listTitles);
        Collections.sort(listTitles);
        System.out.println("Titles sorted: "+listTitles);
    }
}