package BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    long decimal = 0;
    int exponent = 0;
    boolean isBinary = true;

    System.out.print("Enter a binary number: ");
    long binary = input.nextLong();
    long binaryCopy = binary;

    while (binaryCopy > 0) {
      int digit = (int) (binaryCopy % 10);
      if (!(digit == 0 || digit == 1)) {
        isBinary = false;
        break;
      }

      binaryCopy /= 10;

      decimal += digit * Math.pow(2, exponent++);
    }

    if (isBinary) {
      System.out.printf("%nBinary %d is equivalent to the decimal %d%n",
          binary, decimal);
    } else {
      System.out.println("Invalid binary entered");
    }

    input.close();

  }

}
