import java.util.Scanner;

public class TaxCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int count = 1;

    while (count <= 3) {
      System.out.printf("Citizen %d annual earning: ", count);
      double earnings = input.nextDouble();

      double tax = 0;

      if (earnings <= 30_000.0) {
        tax = earnings * 0.15;
      } else {
        tax = 30_000.0 * 0.15 + (earnings - 30_000.0) * 0.20;
      }

      System.out.printf("Tax owed by citizen %d: $ %.2f %n%n", count, tax);
      count++;
    }

    input.close();
  }
}
