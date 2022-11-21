package p02Fundamentals.TheMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T02Weaponsmith {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> weaponName = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandParameters = command.split(" ");
            switch (commandParameters[0]) {
                case "Add":
                    if (Integer.parseInt(commandParameters[2]) >= 0 && Integer.parseInt(commandParameters[2]) < weaponName.size()){
                        weaponName.add(Integer.parseInt(commandParameters[2]), commandParameters[1]);
                    }
                    break;
                case "Remove":
                    weaponName.remove(Integer.parseInt(commandParameters[1]));

                    break;
                case "Check":
                    if (commandParameters[1].equals("Even")) {
                        for (int i = 0; i < weaponName.size(); i++) {
                            if (i % 2 == 0) {
                                System.out.print(weaponName.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < weaponName.size(); i++) {
                            if (i % 2 != 0) {
                                System.out.print(weaponName.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
            }

            command = scanner.nextLine();
        }


        System.out.println("You crafted " + String.join("", weaponName) + "!");
    }
}
