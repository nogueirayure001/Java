package FloorAndCeil;

import java.util.Scanner;

public class FloorAndCeil {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    while (input.hasNext()) {
      double num = input.nextDouble();

      System.out.printf("%nFloor: %d", myFloor(num));
      System.out.printf("%nCeil: %d%n", myCeil(num));

      System.out.print("Enter number: ");
    }

    input.close();

  }

  public static int myFloor(double num) {
    return (int) num;
  }

  public static int myCeil(double num) {
    return (int) num == num ? (int) num : (int) num + 1;
  }

}
