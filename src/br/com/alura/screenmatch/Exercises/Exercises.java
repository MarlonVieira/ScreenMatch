package br.com.alura.screenmatch.Exercises;

public class Exercises {
    public class BankAccount {
        private int numberAccount;
        private double balance;
        public String holder;

        public int getNumberAccount() {
            return numberAccount;
        }

        public void setNumberAccount(int numberAccount) {
            this.numberAccount = numberAccount;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    public class PersonAge {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void checkAge(int age) {
            if (age > 17) {
                System.out.println("Person of legal age!");
            } else {
                System.out.println("Underage person!");
            }
        }
    }

    public class Product{
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void applyDiscount(double percentual) {
            double discount = this.price * (percentual / 100);
            this.price -= discount;
        }
    }
}
