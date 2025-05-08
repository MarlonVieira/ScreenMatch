package br.com.alura.screenmatch.ChallengeCEP;

import br.com.alura.screenmatch.model.Titles;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainChallengeCEP {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String cep = "";
        SearchCEP searchCEP = new SearchCEP();
        Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .setPrettyPrinting()
                        .create();

            try {
                do {
                    System.out.print("Enter the desired CEP: ");
                    cep = scan.nextLine();
                } while (cep.length() != 8);

                Address newAddress = searchCEP.searchAddress(cep);

                System.out.println(newAddress);

//                FileWriter writer = new FileWriter("CEP.json");
//                writer.write(gson.toJson(response.body()));
//                writer.close();
//
//                System.out.println(response.body());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
