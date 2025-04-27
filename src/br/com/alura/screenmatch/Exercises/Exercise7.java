package br.com.alura.screenmatch.Exercises;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        List list = new LinkedList<>();

        list.add(10);
        list.add(12431);
        list.add(124432);
        list.add(543645);
        list.add(1534643560);
        list.add(56786);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}