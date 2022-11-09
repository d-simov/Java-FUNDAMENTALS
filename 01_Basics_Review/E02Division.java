package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E02Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        numbers: 2, 3, 6, 7, 10. print “Not divisible”. Otherwise print "The number is divisible by {number}".

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10");
        } else if (number % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else if (number % 6 == 0) {
            System.out.println("The number is divisible by 6");
        } else if (number % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else if (number % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }
    }
}
