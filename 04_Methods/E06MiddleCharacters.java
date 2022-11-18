package p02Fundamentals.Methods;

import java.util.Scanner;

public class E06MiddleCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter (input);
    }

    private static void printMiddleCharacter(String input) {
        int numberOfChars = input.length();
        if (numberOfChars % 2 != 0) {
            System.out.println(input.charAt(numberOfChars / 2));
        } else {
            System.out.println((char) input.charAt(numberOfChars / 2 - 1) + "" + (char) input.charAt(numberOfChars / 2));
        }
    }
}
