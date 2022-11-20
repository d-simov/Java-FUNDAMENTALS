package p02Fundamentals.TheMidExam;

import java.util.Scanner;

public class P02TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vehiclesRaw = scanner.nextLine();

        String[] allVehicles = vehiclesRaw.split(">>");
        double totalTaxCollected = 0;

        for (int i = 0; i < allVehicles.length; i++) {
            String nextVehicle = allVehicles[i];
            String[] currentVehicle = nextVehicle.split(" ");

            String vehicleType = currentVehicle[0];
            int yearsInUse = Integer.parseInt(currentVehicle[1]);
            int kmTravelled = Integer.parseInt(currentVehicle[2]);
            int initialTax;
            double tax;

            if (vehicleType.equals("family")) {
                initialTax = 50;
                tax = initialTax - yearsInUse * 5 + kmTravelled / 3000 * 12;
            } else if (vehicleType.equals("heavyDuty")) {
                initialTax = 80;
                tax = initialTax - yearsInUse * 8 + kmTravelled / 9000 * 14;
            } else if (vehicleType.equals("sports")) {
                initialTax = 100;
                tax = initialTax - yearsInUse * 9 + kmTravelled / 2000 * 18;
            } else {
                System.out.println("Invalid car type.");
                continue;
            }
            totalTaxCollected += tax;
            System.out.printf("A %s car will pay %.2f euros in taxes.%n", vehicleType, tax);
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", totalTaxCollected);
    }
}
