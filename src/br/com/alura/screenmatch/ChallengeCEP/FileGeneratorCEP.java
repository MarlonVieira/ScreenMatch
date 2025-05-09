package br.com.alura.screenmatch.ChallengeCEP;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class FileGeneratorCEP {
    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        if (address.cep() != null) {
            FileWriter writer = new FileWriter(address.cep() + ".json");
            writer.write(gson.toJson(address));
            writer.close();
            System.out.println(address);
        } else {
            System.out.println("Invalid CEP!");
        }
    }
}