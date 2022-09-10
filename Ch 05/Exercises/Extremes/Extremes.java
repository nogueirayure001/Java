package Extremes;

import java.util.Scanner;

public class Extremes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int min, max;
    min = max = 0;

    System.out.print("Number of entries: ");
    int numOfEntries = input.nextInt();

    if (numOfEntries < 1) {
      System.out.println("Invalid number of entries");
      input.close();
      return;
    }

    for (int i = 0; i < numOfEntries; i++) {
      System.out.print("Enter an integer: ");
      int number = input.nextInt();

      if (i == 0) {
        min = max = number;
      } else {
        if (number < min) {
          min = number;
        } else if (number > max) {
          max = number;
        }
      }
    }

    System.out.printf("%nMinimum number input was %d", min);
    System.out.printf("%nMaximum number input was %d", max);
    System.out.printf("%nTheir sum is %d%n", min + max);

    input.close();
  }
}