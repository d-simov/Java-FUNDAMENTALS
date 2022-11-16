package p02Fundamentals.I03Arrays;

import java.util.Scanner;

public class E03ZigZagArraysString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int row = 0; row < n; row++) {
            String[] rowArray = scanner.nextLine().split(" ");
            for (int j = 0; j < rowArray.length; j++) {
                if (row % 2 == 0 && j % 2 == 0) {
                    array1[row] = rowArray[j];
                }
                if (row % 2 != 0 && j % 2 != 0) {
                    array1[row] = rowArray[j];
                }
                if (row % 2 == 0 && j % 2 != 0) {
                    array2[row] = rowArray[j];
                }
                if (row % 2 != 0 && j % 2 == 0) {
                    array2[row] = rowArray[j];
                }
            }
        }
        System.out.println(String.join(" ", array1));
        System.out.println(String.join(" ", array2));

    }
}
