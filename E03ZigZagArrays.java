package p02Fundamentals.I03Arrays;

import java.util.Scanner;

public class E03ZigZagArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int row = 0; row < n; row++) {
            String[] rowArray = scanner.nextLine().split(" ");
            for (int j = 0; j < rowArray.length; j++) {
                int currentSingleValue = Integer.parseInt(rowArray[j]);
                if (row % 2 == 0 && j % 2 == 0) {
                    array1[row] = currentSingleValue;
                }
                if (row % 2 != 0 && j % 2 != 0) {
                    array1[row] = currentSingleValue;
                }
                if (row % 2 == 0 && j % 2 != 0) {
                    array2[row] = currentSingleValue;
                }
                if (row % 2 != 0 && j % 2 == 0) {
                    array2[row] = currentSingleValue;
                }
            }
        }
        for (int zigZagInt: array1) {
            System.out.print(zigZagInt + " ");
        }
        System.out.println();
        for (int zigZagInt: array2) {
            System.out.print(zigZagInt + " ");
        }
    }
}
