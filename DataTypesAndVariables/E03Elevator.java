package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E03Elevator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPersons = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        int cources = (int) Math.ceil ((double) totalPersons / elevatorCapacity);

        System.out.println(cources);
    }
}
