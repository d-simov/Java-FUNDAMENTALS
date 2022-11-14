package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E08BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Integer.MIN_VALUE;
        String biggestKegModel = "";

        for (int i = 0; i < n; i++) {
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double kegVolume = Math.PI * (Math.pow(kegRadius, 2)) * kegHeight;

            if (kegVolume > maxVolume) {
                maxVolume = kegVolume;
                biggestKegModel = kegModel;
            }

        }
        System.out.println(biggestKegModel);


    }
}
