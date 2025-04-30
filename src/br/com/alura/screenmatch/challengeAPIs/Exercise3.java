package br.com.alura.screenmatch.challengeAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner scan = new Scanner(System.in);

            System.out.print("Enter the desired recipe: ");
        String search = scan.nextLine();

        String address = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + search;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
    }
}