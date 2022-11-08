package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class ALab10MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        for (int i = 1; i <= 10; i++) {
//
//        }
        int i = 1;
        while (i<=10) {
            System.out.printf("%d X %d = %d%n", n, i, n*i);
            i++;
        }
    }
}
