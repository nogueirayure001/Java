import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a 5 digit number: ");
    int number = input.nextInt();

    if (number > 9999 && number <= 99999) {
      int firstDigit = number % 10;
      int secondDigit = (number / 10) % 10;
      int fourthDigit = (number / 1000) % 10;
      int fifthDigit = (number / 10000) % 10;

      if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
        System.out.printf("%n%d is a palindrome number%n%n", number);
      } else {
        System.out.printf("%n%d is NOT a palindrome number%n%n", number);
      }
    } else {
      System.out.println("\nNumber entered is out of bounds");
    }

    input.close();

  }

}
