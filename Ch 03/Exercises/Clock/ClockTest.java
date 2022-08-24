package Exercises.Clock;

import java.util.Scanner;

public class ClockTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    prompt("Informe a hora: ");
    int hour = input.nextInt();

    prompt("Informe o minuto: ");
    int minute = input.nextInt();

    prompt("Informe o segundo: ");
    int second = input.nextInt();

    Clock myClock = new Clock(hour, minute, second);

    myClock.displayTime();

    prompt("Atualize a hora: ");
    hour = input.nextInt();
    myClock.setHour(hour);
    myClock.displayTime();

    prompt("Atualize o minuto: ");
    minute = input.nextInt();
    myClock.setMinute(minute);
    myClock.displayTime();

    prompt("Atualize o segundo: ");
    second = input.nextInt();
    myClock.setSecond(second);
    myClock.displayTime();

  }

  public static void prompt(String prompt) {
    System.out.print(prompt);
  }

}
