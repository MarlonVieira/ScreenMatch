package br.com.alura.screenmatch.challengeAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired book: ");
        String search = scan.nextLine();

        String address = "https://www.googleapis.com/books/v1/volumes?q=search+" + search;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}