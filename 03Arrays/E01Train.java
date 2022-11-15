package p02Fundamentals.I03Arrays;

import java.util.Scanner;

public class E01Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int peopleInWagons[] = new int[n];
        int passengersSum = 0;

        for (int i = 0; i < peopleInWagons.length; i++) {
            peopleInWagons[i] = Integer.parseInt(scanner.nextLine());
            passengersSum += peopleInWagons[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print (peopleInWagons[i] + " ");
        }
        System.out.println();
        System.out.println(passengersSum);
    }
}
