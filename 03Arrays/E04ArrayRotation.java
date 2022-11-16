package p02Fundamentals.I03Arrays;

import java.util.Scanner;

public class E04ArrayRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] sampleArray = scanner.nextLine().split(" ");


        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {

            String tempArrayElement = sampleArray [0];

            for (int j = 0; j < sampleArray.length - 1; j++) {
                sampleArray [j] = sampleArray [j + 1];
            }

            sampleArray [sampleArray.length - 1] = tempArrayElement;
        }

        for (String stringElement:sampleArray) {
            System.out.print (stringElement + " ");
        }
    }
}
