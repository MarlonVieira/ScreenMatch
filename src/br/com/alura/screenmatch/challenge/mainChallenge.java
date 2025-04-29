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

        int stay = 1;

        while (stay == 1) { 
            System.out.printf("Enter the product: ");
            String product = scan.next();

            System.out.printf("Enter the product value: ");
            double valueProduct = scan.nextDouble();

            Sales sale = new Sales(product, valueProduct);
            boolean paySale = card.paySale(sale);

            if (paySale) {
                System.out.println("\nPurchases made!\n");
                System.out.printf("Enter 0 to exit or 1 to continue: ");
                stay = scan.nextInt();
            } else if (card.checkBalance() > 0) {
                System.out.println("\nPurchase denied, balance available: " + card.checkBalance() + "\n");
            } else {
                System.out.println("\nPurchase denied, insufficient balance!\n");
                stay = 0;
            }
        }

        card.showAccountDetails();

        System.out.println("***********************************************");
        System.out.println("Purchases made:");
        for (Sales c : card.getSales()) {
            System.out.println(c.getProduct() + " - " +c.getValue());
        }
        System.out.println("***********************************************");

        System.out.println("\nCard balance: "  + card.checkBalance());

        scan.close();
    }
}