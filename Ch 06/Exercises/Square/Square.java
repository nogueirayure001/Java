package Square;

import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter square size: ");
    int size = input.nextInt();

    System.out.print("Enter fill character: ");
    char fillCharacter = input.next().charAt(0);

    displaySquare(size, fillCharacter);

    input.close();
  }

  public static void displaySquare(int size, char fillCharacter) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.printf("%c", fillCharacter);
      }

      System.out.println();
    }
  }

}
