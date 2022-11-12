package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E01IntegerOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        long result = (( ((long) firstNumber + (long) secondNumber) / (long) thirdNumber) * (long) (fourthNumber));
        System.out.println(result);
    }
}
