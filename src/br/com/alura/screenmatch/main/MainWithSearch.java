package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.Exceptions.yearException;
import br.com.alura.screenmatch.model.Titles;
import br.com.alura.screenmatch.model.TitlesOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner scan = new Scanner(System.in);
        String search = "";
        List<Titles> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.toUpperCase().equalsIgnoreCase("QUIT")) {
            try {
                System.out.print("Enter the desired movie or serie: ");
                search = scan.nextLine();

                if (search.toUpperCase().equalsIgnoreCase("QUIT")){
                    break;
                }

                String address = "http://www.omdbapi.com/?t=" + search.replace(" ", "_") + "&apikey=64c30bc4";

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TitlesOMDB titlesOMDB = gson.fromJson(json, TitlesOMDB.class);
                System.out.println(titlesOMDB);

                Titles myTitles = new Titles(titlesOMDB);
                System.out.println("Title Converted: ");
                System.out.println(myTitles);

                titles.add(myTitles);
            } catch(NumberFormatException e){
                System.out.println("An exception occurred: ");
                System.out.println(e.getMessage());
            } catch(IllegalArgumentException e ){
                System.out.println("Error in the search ocurred: ");
                System.out.println(e.getMessage());
            } catch(yearException e){
                System.out.println(e.getMessage());
            }
        }

        FileWriter writer = new FileWriter("Movies.json");
        writer.write(gson.toJson(titles));
        writer.close();
        System.out.println(titles.toString());
        System.out.println("The program was successfully finalized!");
    }
}
