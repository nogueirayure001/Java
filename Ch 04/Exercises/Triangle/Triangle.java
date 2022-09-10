import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the triangle base length (1 - 10): ");
    int baseLength = input.nextInt();

    if (baseLength > 0 && baseLength <= 10) {
      int i, j;
      i = baseLength;

      while (i >= 1) {
        j = i;

        while (j >= 1) {
          System.out.print("*");
          j--;
        }

        i--;

        System.out.println();
      }
    } else {
      System.out.println("Base length is out of bounds");
    }

    input.close();
  }
}
