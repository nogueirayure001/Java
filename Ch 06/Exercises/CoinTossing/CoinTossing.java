package CoinTossing;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
  public enum CoinFace {
    HEADS, TAILS
  };

  private enum ProgramStatus {
    FINISHED, RUNNING
  };

  private static SecureRandom myRandomNumber = new SecureRandom();

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ProgramStatus status = ProgramStatus.RUNNING;
    int headsCount = 0;
    int tailsCount = 0;

    do {
      System.out.println("1 - Flip coin\n2 - Exit");
      System.out.print("Choose option: ");

      byte option = input.nextByte();

      if (option == 1) {
        CoinFace result = flip();

        if (result == CoinFace.HEADS) {
          System.out.println("HEADS!");
          headsCount++;
        } else {
          System.out.println("TAILS!");
          tailsCount++;
        }
      } else if (option == 2) {
        status = ProgramStatus.FINISHED;
      } else {
        System.out.println("Invalid option");
      }

    } while (status != ProgramStatus.FINISHED);

    System.out.printf("%n%nHEADS: %d", headsCount);
    System.out.printf("%nTAILS: %d%n", tailsCount);

    input.close();

  }

  public static CoinFace flip() {
    return myRandomNumber.nextBoolean() ? CoinFace.HEADS : CoinFace.TAILS;
  }

}
