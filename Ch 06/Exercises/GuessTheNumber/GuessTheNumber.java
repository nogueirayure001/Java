package GuessTheNumber;

import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber {
  private static SecureRandom random = new SecureRandom();
  private static Scanner input = new Scanner(System.in);

  enum GameStatus {
    FINISHED, PAUSED, IN_PROGRESS
  };

  public static void main(String[] args) {
    GameStatus status = GameStatus.IN_PROGRESS;

    do {
      if (status == GameStatus.IN_PROGRESS) {
        guessNumber();
      }

      status = GameStatus.PAUSED;

      status = optionsPrompt();
    } while (status != GameStatus.FINISHED);

    input.close();

  }

  public static void guessNumber() {
    int number = 1 + random.nextInt(1000);
    int counter = 0;
    int guess;

    do {
      System.out.print("Guess a number between 1 and 1000: ");
      guess = input.nextInt();
      counter++;

      if (guess > number) {
        System.out.println("Too high! Try again");
      } else if (guess < number) {
        System.out.println("Too low! Try again");
      }

    } while (guess != number);

    if (counter < 10) {
      System.out.println("\nEither you know the secret or you got lucky!");
    } else if (counter == 10) {
      System.out.println("\nAha! You know the secret!");
    } else {
      System.out.println("\nYou should be able to do better!");
    }
  }

  public static GameStatus optionsPrompt() {
    System.out.printf("%n%s%n%s%n%s",
        "1 - Continue Playing",
        "2 - Exit game",
        "Choose an option: ");
    int option = input.nextInt();

    switch (option) {
      case 1:
        return GameStatus.IN_PROGRESS;
      case 2:
        return GameStatus.FINISHED;
      default:
        return GameStatus.PAUSED;
    }
  }
}
