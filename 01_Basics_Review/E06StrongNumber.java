package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E06StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startingNumber = number;
        int digit = 0;
        int factorialSum = 0;

        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            factorialSum = factorialSum + factorial;
        }
        if (factorialSum == startingNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}