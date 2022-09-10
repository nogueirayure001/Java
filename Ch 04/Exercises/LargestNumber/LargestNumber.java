import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int count = 1;

    System.out.print("Input number: ");
    double number = input.nextDouble();
    double largest = number;

    while (count < 10) {
      System.out.print("\nInput number: ");
      number = input.nextDouble();
      count++;

      if (number > largest) {
        largest = number;
      }
    }

    System.out.printf("\n\nThe largest entered number was %f", largest);

    input.close();
  }
}