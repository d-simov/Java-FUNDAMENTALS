package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class ALab01SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {

            int currentDigitSum = 0;
            int currentNum = currentNumber;
            while (currentNum > 0) {
                currentDigitSum = currentDigitSum + currentNum % 10;
                currentNum = currentNum / 10;
            }
            if (currentDigitSum == 5 || currentDigitSum == 7 || currentDigitSum == 11) {
                System.out.printf("%d -> True%n",currentNumber);
            } else {
                System.out.printf("%d -> False%n",currentNumber);
            }
            
        }

    }

}
