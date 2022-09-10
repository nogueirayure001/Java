import java.util.Scanner;

public class LargestTwoNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int count = 1;

    System.out.print("Input number: ");
    double number = input.nextDouble();
    double largest = number;
    double secondLargest = largest;

    while (count < 10) {
      System.out.print("\nInput number: ");
      number = input.nextDouble();
      count++;

      if (number > largest) {
        secondLargest = largest;
        largest = number;
      } else if (number > secondLargest) {
        secondLargest = number;
      } else if (count == 2) {
        secondLargest = number;
      }
    }

    System.out.printf("\n\nThe largest entered number was %f", largest);
    System.out.printf("\nThe second largest entered number was %f\n\n", secondLargest);

    input.close();
  }
}