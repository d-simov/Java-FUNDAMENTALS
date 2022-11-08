package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab07TheatrePromotion2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        switch (dayOfWeek) {
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) { ticketPrice = 12;}
                if (18 < age && age <= 64) { ticketPrice = 18;}
                break;
            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) { ticketPrice = 15;}
                if (18 < age && age <= 64) { ticketPrice = 20;}
                break;
            case "Holiday":
                if (0 <= age && age <= 18) {ticketPrice = 5;}
                if (18 < age && age <= 64) {ticketPrice = 12;}
                if (64 < age && age <= 122) {ticketPrice = 10;}
                break;
            }
            if (ticketPrice == 0) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", ticketPrice);
        }
    }
}
