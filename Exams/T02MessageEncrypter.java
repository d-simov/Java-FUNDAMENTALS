package p02Fundamentals.TheFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02MessageEncrypter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([*@])(?<tag>[A-Z][a-z]{2,})(\\1): \\[(?<n1>[A-Za-z])\\]\\|\\[(?<n2>[A-Za-z])\\]\\|\\[(?<n3>[A-Za-z])\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String message = scanner.nextLine();
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                String tag = matcher.group("tag");
                int n1 = matcher.group("n1").charAt(0);
                int n2 = matcher.group("n2").charAt(0);
                int n3 = matcher.group("n3").charAt(0);
                System.out.println(tag +  ": " + n1 + " " + n2 + " " + n3);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
