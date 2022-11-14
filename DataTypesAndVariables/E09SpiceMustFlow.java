package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E09SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int spiceExtracted = 0;
        int daysHarvesting = 0;

        while (yield >= 100) {
            daysHarvesting++;
            spiceExtracted += yield - 26;
            yield -= 10;
        }

        if (spiceExtracted >= 26) {
            spiceExtracted -= 26;
        }

        System.out.println(daysHarvesting);
        System.out.println(spiceExtracted);

    }
}
