package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab09SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(number);
            sum += number;
            number += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
