package br.com.alura.screenmatch.ChallengeCEP;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchCEP {
    public SearchCEP() {
    }

    public Address searchAddress(String cep) throws IOException, InterruptedException {
        URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                                             .newHttpClient()
                                             .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Address.class);
        } catch (IOException | InterruptedException e) {
            throw  new RuntimeException("Unable to get address from this CEP!");
        }
    }
}
