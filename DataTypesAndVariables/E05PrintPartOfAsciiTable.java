package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E05PrintPartOfAsciiTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstChar = Integer.parseInt(scanner.nextLine());
        int lastChar = Integer.parseInt(scanner.nextLine());

        for (int i = firstChar; i <= lastChar; i++) {
            char currentChar;
            currentChar = (char) i;
            System.out.print(currentChar + " ");

        }
    }
}
