package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab04BackIn30Minutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        if (hour >= 0 || hour < 24) {
            if (minute >=0 || minute < 60) {
                minute = minute + 30;
                if (minute > 59) {
                    hour = hour + 1;
                    minute = minute - 60;
                    if (hour == 24) {
                        hour = 0;
                    }

                }

            } else {
                System.out.println("Incorrect minute value");
            }

        } else {
            System.out.println("Incorrect hour value");
        }
        System.out.printf("%d:%02d", hour, minute);




    }
}
