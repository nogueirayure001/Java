import java.util.Scanner;

public class Comission {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double weeklySalary = 200;
    final double comissionPercentage = 0.09;

    System.out.print("Enter sold item value ( -1 to leave ): ");
    double itemValue = input.nextDouble();

    while (itemValue > 0) {
      weeklySalary += comissionPercentage * itemValue;

      System.out.print("%nEnter sold item value: ( -1 to leave ): ");
      itemValue = input.nextDouble();
    }

    System.out.printf("This Week's salary is $ %.2f%n%n", weeklySalary);

    input.close();
  }
}
