import java.util.Scanner;

public class TriangleAlt {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the triangle base length (1 - 10): ");
    int baseLength = input.nextInt();

    if (baseLength > 0 && baseLength <= 10) {
      makeTriangle(baseLength);
    } else {
      System.out.println("Base length is out of bounds");
    }

    input.close();
  }

  public static void makeTriangle(int base) {
    if (base <= 0) {
      return;
    }

    int counter = base;

    while (counter > 0) {
      System.out.print("*");
      counter--;
    }

    System.out.println();

    makeTriangle(--base);
  }
}
