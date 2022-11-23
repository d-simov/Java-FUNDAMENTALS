package p02Fundamentals.TheFinalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T01Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
//        List<Character> usernameAsChars = username.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
//        List<String> usernameAsStrings = Arrays.stream(username.split("")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commandParameters = command.split("\\s+");

            switch (commandParameters[0]) {
                case "Letters":
                    switch (commandParameters[1]) {
                        case "Lower":
                           username = username.toLowerCase();
                            System.out.println(username);
                            break;
                        case "Upper":
                            username = username.toUpperCase();
                            System.out.println(username);
                            break;
                    }
                    break;
                case "Reverse":
                    if (Integer.parseInt(commandParameters[1]) >= 0 && Integer.parseInt(commandParameters[2]) <= username.length()) {
                        for (int i = Integer.parseInt(commandParameters[2]); i >= Integer.parseInt(commandParameters[1]); i--) {
                            System.out.print("" + username.charAt(i));
                        }
                        System.out.println();
                    }
                    break;
                case "Substring":
                    if (username.contains(commandParameters[1])){
                        username = username.replace(commandParameters[1], "");
                        System.out.println(username);
                    } else {
                        System.out.println("The username " + username + " doesn't contain " + commandParameters [1] + "");
                    }
                    break;
                case "Replace":
                    username = username.replace(commandParameters[1], "-");

                    System.out.println(username);
                    break;
                case "IsValid":
                    if (username.contains(commandParameters[1])){
                        System.out.println("Valid username.");
                    } else {
                        System.out.println(commandParameters[1] + " must be contained in your username.");
                    }
                    break;
            }
            command = scanner.nextLine();

        }
    }
}
