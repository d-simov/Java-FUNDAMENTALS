package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab07TheatrePromotion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        if (age >=0 && age <=18) {
            switch (day) {
                case "weekday":
                    ticketPrice = 12;
                    break;
                case "weekend":
                    ticketPrice = 15;
                    break;
                case "holiday":
                    ticketPrice = 5;
                    break;
            }
        }
        if (age >18 && age <=64) {
            switch (day) {
                case "weekday":
                    ticketPrice = 18;
                    break;
                case "weekend":
                    ticketPrice = 20;
                    break;
                case "holiday":
                    ticketPrice = 12;
                    break;
            }
        }
        if (age >64 && age <=122) {
            switch (day) {
                case "weekday":
                    ticketPrice = 12;
                    break;
                case "weekend":
                    ticketPrice = 15;
                    break;
                case "holiday":
                    ticketPrice = 10;
                    break;
            }
        }
        if (ticketPrice !=0) {
            System.out.printf("%d$", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
