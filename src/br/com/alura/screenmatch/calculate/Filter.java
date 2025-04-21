package br.com.alura.screenmatch.calculate;

public class Filter {
    private String recomendation;

    public void filtering(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("This is among the recommended ones at the moment.");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println(" is well rated at the moment.");
        } else {
            System.out.println("This isn't among the recommended ones at the moment.");
        }
    }
}