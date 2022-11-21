package p02Fundamentals.TheMidExamRetake;

import java.util.Scanner;

public class T01SwimmingChampionship {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int pointsNeeded = Integer.parseInt(scanner.nextLine());
        int countOfSwimmers = Integer.parseInt(scanner.nextLine());
        double roomPrice = Double.parseDouble(scanner.nextLine());
        double participationFeePerSwimmer = Double.parseDouble(scanner.nextLine());

        double moneyNeeded = countOfSwimmers * participationFeePerSwimmer;
        double pointsReached = 0;
        double pointsPreviousDay = 0;

        for (int i = 0; i < days; i++) {
            moneyNeeded += (countOfSwimmers * roomPrice);
            double pointForTheDay = Double.parseDouble(scanner.nextLine());

            pointsReached = pointsReached + pointForTheDay + 0.05 * pointsPreviousDay;
            pointsPreviousDay = pointForTheDay;

        }
        double moneyLeftToPay = 0;

        if (pointsReached >= pointsNeeded) {
            moneyLeftToPay = 0.75 * moneyNeeded;
            System.out.printf("Money left to pay: %.2f BGN.%nThe championship was successful!", moneyLeftToPay);
        } else {
            moneyLeftToPay = 0.9 * moneyNeeded;
            System.out.printf("Money left to pay: %.2f BGN.%nThe championship was not successful.", moneyLeftToPay);
        }


    }
}
