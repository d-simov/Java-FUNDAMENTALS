package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E03Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double singlePrice = 0;
        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                if (weekDay.equals("Friday")) {
                    singlePrice = 8.45;
                } else if (weekDay.equals("Saturday")) {
                    singlePrice = 9.80;
                } else if (weekDay.equals("Sunday")) {
                    singlePrice = 10.46;
                }
                break;
            case "Business":
                if (weekDay.equals("Friday")) {
                    singlePrice = 10.9;
                } else if (weekDay.equals("Saturday")) {
                    singlePrice = 15.6;
                } else if (weekDay.equals("Sunday")) {
                    singlePrice = 16;
                }
                break;
            case "Regular":
                if (weekDay.equals("Friday")) {
                    singlePrice = 15;
                } else if (weekDay.equals("Saturday")) {
                    singlePrice = 20;
                } else if (weekDay.equals("Sunday")) {
                    singlePrice = 22.5;
                }
                break;
        }
        totalPrice = singlePrice * groupNumber;

        if (groupType.equals("Students") && groupNumber >= 30) {
            totalPrice = totalPrice * 0.85;
        } else if (groupType.equals("Business") && groupNumber >= 100) {
            totalPrice = totalPrice - 10 * singlePrice;
        } else if (groupType.equals("Regular") && (groupNumber >= 10 && groupNumber <= 20)) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
