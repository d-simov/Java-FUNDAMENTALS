package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E05Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPassword = "";
        String passTry = scanner.nextLine();
        int countTries = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);
            correctPassword = String.format("%s%c", correctPassword, letter);

        }
        while (!passTry.equals(correctPassword)) {
            countTries++;

            if (countTries >= 4) {
                System.out.printf("User %s blocked!%n", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            passTry = scanner.nextLine();
        }
        if (passTry.equals(correctPassword)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
