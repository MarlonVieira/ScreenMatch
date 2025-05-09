package br.com.alura.screenmatch.challengeAPIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the currency conversion: ");
        String currency = scan.nextLine();

        System.out.print("Enter the desired crypto coin: ");
        String crypto = scan.nextLine();

        String address = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=" +currency+ "&ids=" +crypto+ "&x_cg_demo_api_key=CG-rtTddrVLUknWiWGLNpEv4XMC";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}