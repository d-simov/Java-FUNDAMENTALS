package p02Fundamentals.I03Arrays;

import java.util.Scanner;

public class E05TopIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] stringArray = scanner.nextLine().split(" ");
        int [] intArray = new int [stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray [i] = Integer.parseInt(stringArray[i]);
        }

        for (int i = 0; i < intArray.length; i++) {
            int topInteger = 0;
            boolean isTopInteger = true;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] <= intArray[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                topInteger = intArray [i];
                System.out.print(topInteger + " ");
            }

        }

    }
}
