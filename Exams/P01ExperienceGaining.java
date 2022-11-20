package p02Fundamentals.TheMidExam;

import java.util.Scanner;

public class P01ExperienceGaining {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double experienceNeeded = Double.parseDouble(scanner.nextLine());
        int battlesTotal = Integer.parseInt(scanner.nextLine());
        double currentExperience = 0;
        int battlesCounter = 0;
        boolean unlockTank = true;

        while (currentExperience < experienceNeeded) {
            if (battlesCounter >= battlesTotal) {
                unlockTank = false;
                break;
            } double battleExperience = Double.parseDouble(scanner.nextLine());

            battlesCounter ++;
            if (battlesCounter % 3 == 0) {
                battleExperience = battleExperience * 1.15;
            } else if (battlesCounter % 5 == 0) {
                battleExperience = battleExperience * 0.9;
            }
            if (battlesCounter % 15 == 0) {
                battleExperience = battleExperience * 1.05;
            }
            currentExperience += battleExperience;

        }
        if (unlockTank) {
            System.out.printf("Player successfully collected his needed experience for %d battles.%n",battlesCounter);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.%n", Math.abs(experienceNeeded - currentExperience));
        }
    }
}
