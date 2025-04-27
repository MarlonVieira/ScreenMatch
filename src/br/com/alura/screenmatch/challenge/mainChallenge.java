package br.com.alura.screenmatch.challenge;

import java.util.Scanner;

public class mainChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter card type(C-Credit or D-Debit): ");
        String type = scan.next();
        System.out.printf("Enter the account number: ");
        String number = scan.next();
        System.out.printf("Enter the holder account name: ");
        String holderName = scan.next();
        System.out.printf("Enter the flag: ");
        String flag = scan.next();
        double value = 0.0;
        if ("C".equalsIgnoreCase(type)) {
            System.out.print("Enter the limit: ");
            value = scan.nextDouble();
        } else if ("D".equalsIgnoreCase(type)) {
            System.out.print("Enter the balance: ");
            value = scan.nextDouble();
        }

        Card card = CardFactory.createCard(type, number, holderName, flag, value);

        card.showAccountDetails();
        scan.close();
    }
}
