package br.com.alura.screenmatch.challengeAPIs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Person(String name, int Age, String city) {}

public class Exercise4Person {

    public static void main(String [] args) {
        String jsonPerson = "{\"name\":\"Marlon\",\"Age\":20,\"city\":\"Pato Branco\"}";
        String jsonPersonFlex = "{\"name\":\"Marlon\",\"city\":\"Pato Branco\"}";

        Gson gson = new Gson();
        Gson gsonFlex = new GsonBuilder().setLenient().create();

        Person person = gson.fromJson(jsonPerson, Person.class);
        Person personFlex = gsonFlex.fromJson(jsonPersonFlex, Person.class);

        System.out.println("Person object: " + person);
        System.out.println("Person object flexible: " + personFlex);
    }
}
