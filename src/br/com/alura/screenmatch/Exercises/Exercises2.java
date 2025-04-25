package br.com.alura.screenmatch.Exercises;

public class Exercises2 {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setSmell(true);
        dog.setName("Doggo");
        dog.setSpecies("Bloodhound");
        dog.setWeight(15.6);

        Animal animal = (Animal) dog;

        System.out.println("Specie: "+ animal.getSpecies());

        if (animal instanceof Dog) {
            Dog dog2 = (Dog) animal;
            System.out.println("Smell: " + dog2.isSmell());
        } else {
            System.out.println("Object is not a Dog.");
        }
    }
}
