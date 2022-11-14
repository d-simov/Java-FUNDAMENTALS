package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E07WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalWaterQuantity = 0;

        for (int i = 0; i < n; i++) {

            int currentWaterQuantity = Integer.parseInt(scanner.nextLine());

            if ((totalWaterQuantity + currentWaterQuantity) <= 255) {

                totalWaterQuantity += currentWaterQuantity;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(totalWaterQuantity);
    }
}
