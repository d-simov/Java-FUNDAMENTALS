package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab12EvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
//        boolean isEven = false;
//
//        while (!isEven) {
//            if (number % 2 != 0) {
//                System.out.println("Please write an even number.");
//            } else {
//                System.out.printf("The number is: %d", Math.abs(number));
//                isEven = true;
//
//            }
//            number = Integer.parseInt(scanner.nextLine());
//        }

        while ((number % 2 != 0)) {
                System.out.println("Please write an even number.");

                number = Integer.parseInt(scanner.nextLine());

            }
        System.out.printf("The number is: %d", Math.abs(number));
    }
}
