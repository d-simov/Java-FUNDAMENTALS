package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E04PrintAndSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int seconfNum = Integer.parseInt(scanner.nextLine());
        int numSum = 0;

        for (int i = firstNum; i <= seconfNum ; i++) {
            System.out.print(i + " ");
            numSum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", numSum);
    }
}
