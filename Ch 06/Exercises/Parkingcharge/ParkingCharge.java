package Parkingcharge;

import java.util.Scanner;

public class ParkingCharge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double totalReceipt = 0;

    System.out.print("\nHours parked: ");

    while (input.hasNext()) {
      int hoursParked = input.nextInt();

      double charge = calculateCharge(hoursParked);
      totalReceipt += charge;

      System.out.printf("%nClient charge: $%.2f", charge);
      System.out.printf("%nTotal receipt: $%.2f%n", totalReceipt);
      System.out.print("\nHours parked: ");
    }

    System.out.println();

    input.close();

  }

  public static double calculateCharge(int hoursParked) {
    double charge = 2.0;

    if (hoursParked > 3) {
      charge += 0.50 * (hoursParked - 3);
    }

    if (charge > 10.0) {
      charge = 10.0;
    }

    return charge;
  }

}