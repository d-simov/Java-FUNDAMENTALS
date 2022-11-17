package p02Fundamentals.Methods;

import java.util.Scanner;

public class E04PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = isValidLength (password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidChars = isValidChars (password);
        if (!isValidChars) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isAtLeast2Digits = isAtLeast2Digits (password);
        if (!isAtLeast2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidChars && isAtLeast2Digits) {
            System.out.println("Password is valid");
        }

    }


    private static boolean isValidLength (String password) {
        if (6 <= password.length() && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidChars (String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAtLeast2Digits(String password) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                numberOfDigits++;
            }
        }

            return numberOfDigits >= 2;
        }
    }


