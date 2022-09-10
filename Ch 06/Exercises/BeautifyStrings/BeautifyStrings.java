package BeautifyStrings;

import java.util.Scanner;

public class BeautifyStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = input.nextLine();

    String beautifiedStr = checkFullStop(str);
    beautifiedStr = checkCapitalFirstLetter(beautifiedStr);

    System.out.printf("%n%nBeautifed String: %n%s%n", beautifiedStr);

    input.close();
  }

  public static String checkFullStop(String str) {
    int lastChar = str.length() - 1;

    if (str.charAt(lastChar) != '.') {
      return str + '.';
    }

    return str;
  }

  public static String checkCapitalFirstLetter(String str) {
    char firstChar = str.charAt(0);

    if (firstChar < 'A' || firstChar > 'Z') {
      if (firstChar >= 'a' && firstChar <= 'z') {
        firstChar -= 32;

        return firstChar + str.substring(1);
      }
    }

    return str;
  }

}
