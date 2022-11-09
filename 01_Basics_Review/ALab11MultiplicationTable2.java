package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab11MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startingMultiplier = Integer.parseInt(scanner.nextLine());

        do {
            int result = number * startingMultiplier;
            System.out.printf("%d X %d = %d%n", number, startingMultiplier, result);
            startingMultiplier++;
        } while (startingMultiplier <= 10);
    }
}
