package p02Fundamentals.I01BasicsRevision;

import java.util.Scanner;

public class E01Ages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String adulthood = "unidentified";

        if (age >= 0 && age <= 2) {adulthood = "baby";}
        if (age >= 3 && age <= 13) {adulthood = "child";}
        if (age >= 14 && age <= 19) {adulthood = "teenager";}
        if (age >= 20 && age <= 65) {adulthood = "adult";}
        if (age > 65) {adulthood = "elder";}

        System.out.println(adulthood);
    }
}
