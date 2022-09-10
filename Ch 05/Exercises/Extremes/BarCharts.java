package Extremes;

import java.util.Scanner;

public class BarCharts {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String chart = "";

    for (int i = 1; i <= 5; i++) {
      System.out.printf("Enter frequency %d: ", i);
      int frequency = input.nextInt();

      String bar = "\n";
      for (int j = 0; j < frequency; j++) {
        bar += "*";
      }

      chart += bar;
    }

    System.out.printf("%s%n", chart);

    input.close();
  }
}
