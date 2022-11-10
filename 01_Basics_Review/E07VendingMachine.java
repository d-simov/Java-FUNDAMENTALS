package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E07VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amount = 0;
        double money = 0;
        double cost = 0;
        String input = scanner.nextLine();
        boolean isValidDrink = true;

        while (!input.equals("Start")) {
            money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1.0 || money == 2.0) {
                amount = amount + money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input = scanner.nextLine();

        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    cost = 2.0;
                    break;
                case "Water":
                    cost = 0.7;
                    break;
                case "Crisps":
                    cost = 1.5;
                    break;
                case "Soda":
                    cost = 0.8;
                    break;
                case "Coke":
                    cost = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValidDrink = false;
                    break;
            }
            if (cost <= amount) {
                amount -= cost;
                if (isValidDrink) {
                    System.out.printf("Purchased %s%n", product);
                }
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", amount);
    }
}
