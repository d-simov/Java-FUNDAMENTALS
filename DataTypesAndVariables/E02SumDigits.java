package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E02SumDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digitSum = 0;

        while (number > 0) {
            int digit = number % 10;
            digitSum += digit;

            number /=10;
        }
        System.out.println(digitSum);
    }
}
