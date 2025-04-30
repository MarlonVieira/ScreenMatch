package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Titles;
import br.com.alura.screenmatch.model.TitlesOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired movie or serie: ");
        String search = scan.nextLine();

        String address = "http://www.omdbapi.com/?t=" + search + "&apikey=64c30bc4";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                         .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                         .create();

        TitlesOMDB titlesOMDB = gson.fromJson(json, TitlesOMDB.class);
        System.out.println(titlesOMDB);

        Titles titles = new Titles(titlesOMDB);
        System.out.println("Title Converted: ");
        System.out.println(titles);
    }
}
