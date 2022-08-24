package Exercises.HeartRates;

import java.util.Scanner;

public class HeartRatesApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    prompt("First name: ");
    String firstName = input.nextLine();

    prompt("Last name: ");
    String lastName = input.nextLine();

    prompt("Birth month (1 - 12): ");
    int birthMonth = input.nextInt();

    prompt("Birth day: ");
    int birthDay = input.nextInt();

    prompt("Birth year: ");
    int birthYear = input.nextInt();

    HeartRates myHR = new HeartRates(firstName, lastName,
        birthMonth, birthDay, birthYear);

    System.out.printf("%n%nName: %s %s%n",
        myHR.getFirstName(), myHR.getLastName());

    System.out.printf("Born: %d/%d/%d%n",
        myHR.getBirthMonth(), myHR.getBirthDay(), myHR.getBirthYear());

    System.out.printf("Age: %d%n", myHR.getAge());

    System.out.printf("Maximum heart rate: %d beats per minute%n",
        myHR.getMaxHeartRate());

    System.out.printf("Target heart rate: %s%n",
        myHR.getTargetHeartRate());

  }

  public static void prompt(String prompt) {
    System.out.print(prompt);
  }
}
