package br.com.alura.screenmatch.challenge;
import java.util.HashMap;
import java.util.Map;

public class CardFactory {
    private static final Map<String, Card> cards = new HashMap<>();

    static {
        cards.put("C", new Credit("", "", 0.0, ""));
        cards.put("D", new Debit("", "", "", 0.0));
    }

    public static Card createCard(String type, String number, String nameHolder, String flag, double value) {
        Card card = cards.get(type.toUpperCase());

        if (card == null) {
            System.out.println("Invalid card type.");
            return null;
        }

        if ("C".equalsIgnoreCase(type)) {
            return new Credit(number, nameHolder, value, flag);
        } else if ("D".equalsIgnoreCase(type)) {
            return new Debit(number, nameHolder, flag, value);
        }
        return null;
    }
}