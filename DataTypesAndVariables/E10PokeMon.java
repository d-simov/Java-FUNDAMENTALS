package p02Fundamentals.I02DataTypesAndVariables;

import java.util.Scanner;

public class E10PokeMon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int n = pokePower;
        int counter = 0;

        while (n >= distance){
            counter ++;

                n -= distance;
                if (n == pokePower / 2) {
                    if (exhaustionFactor == 0) {
                        continue;
                    }
                n /= exhaustionFactor;
            }
        }
        System.out.println(n);
        System.out.println(counter);
    }
}
