package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E04SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int charSUM = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            char currentChar =  input.charAt(0);

            charSUM += (int) currentChar;

        }
        System.out.printf("The sum equals: %d%n", charSUM);
    }
}
