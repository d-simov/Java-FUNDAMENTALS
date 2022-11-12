package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class ALab00ExtractNumberFromString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = 0;

        for (int i = 0; i < input.length(); i++) {

            char currentSymbol = input.charAt(i);
            if (currentSymbol >= '0' && currentSymbol <= '9') {
                number = (number * 10 + (currentSymbol - '0'));

            }

        }
        System.out.println(number / 2);
    }
}
