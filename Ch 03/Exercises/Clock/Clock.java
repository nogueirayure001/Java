package Exercises.Clock;

public class Clock {
  private int hour;
  private int minute;
  private int second;

  public Clock(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour > 23) {
      this.hour = 0;
      return;
    }

    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute > 59) {
      this.minute = 0;
      return;
    }

    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    if (second > 59) {
      this.second = 0;
      return;
    }

    this.second = second;
  }

  public void displayTime() {
    System.out.printf("%n%d horas : %d minutos : %d segundos%n",
        hour, minute, second);
  }
}
