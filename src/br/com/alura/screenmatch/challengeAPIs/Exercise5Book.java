package br.com.alura.screenmatch.challengeAPIs;

import com.google.gson.Gson;

record Publisher(String name, String city) {}
record Book(String title, String author, Publisher publisher) {}

public class Exercise5Book {

    public static void main(String[] args) {
        String jsonBook = "{\"title\":\"Adventures of Java\",\"author\":\"Akemi\",\"publisher\":{\"name\":\"TechBooks\",\"city\":\"Pato Branco\"}}";

        Gson gson = new Gson();
        Book book= gson.fromJson(jsonBook, Book.class);

        System.out.println("Object book: " + book);
    }
}
