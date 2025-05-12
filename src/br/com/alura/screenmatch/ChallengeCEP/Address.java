package br.com.alura.screenmatch.ChallengeCEP;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public record Address(String cep, String street, String complement, String locality, String state) {
    public static Address fromJson(String json) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        String cep = jsonObject.get("cep").getAsString();
        String street = jsonObject.get("logradouro").getAsString();
        String complement = jsonObject.get("complemento").getAsString();
        String locality = jsonObject.get("localidade").getAsString();
        String state = jsonObject.get("uf").getAsString();

        return new Address(cep, street, complement, locality, state);
    }
}