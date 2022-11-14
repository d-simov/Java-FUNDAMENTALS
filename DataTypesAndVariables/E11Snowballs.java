package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E11Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int snowballNumber = Integer.parseInt(scanner.nextLine());

        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        double snowballValue = Integer.MIN_VALUE;

        for (int i = 0; i < snowballNumber; i++) {
            double currentBallSnow = Double.parseDouble(scanner.nextLine());
            double currentBallTime = Double.parseDouble(scanner.nextLine());
            double currentBallQuality = Double.parseDouble(scanner.nextLine());

            double currentBallValue = Math.pow((currentBallSnow / currentBallTime), currentBallQuality);

            if (currentBallValue > snowballValue) {
                snowballValue = currentBallValue;
                snowballSnow = (int) currentBallSnow;
                snowballTime = (int) currentBallTime;
                snowballQuality = (int) currentBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);

    }
}
