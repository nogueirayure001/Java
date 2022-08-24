package Exercises.HeartRates;

public class HeartRates {
  private String firstName;
  private String lastName;
  private int birthMonth;
  private int birthDay;
  private int birthYear;

  final private int CURRENT_YEAR = 2022;

  public HeartRates(String firstName, String lastName, int birthMonth,
      int birthDay, int birthYear) {
    this.firstName = firstName;
    this.lastName = lastName;

    if (birthMonth >= 1 && birthMonth < 13) {
      this.birthMonth = birthMonth;
    }

    if (birthDay >= 1 && birthDay < 32) {
      this.birthDay = birthDay;
    }

    if (birthYear > 0) {
      this.birthYear = birthYear;
    }
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getBirthMonth() {
    return birthMonth;
  }

  public void setBirthMonth(int birthMonth) {
    if (birthMonth >= 1 && birthMonth < 13) {
      this.birthMonth = birthMonth;
    }
  }

  public int getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(int birthDay) {
    if (birthDay >= 1 && birthDay < 32) {
      this.birthDay = birthDay;
    }
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    if (birthYear > 0) {
      this.birthYear = birthYear;
    }
  }

  public int getAge() {
    return CURRENT_YEAR - birthYear;
  }

  public int getMaxHeartRate() {
    return 220 - this.getAge();
  }

  public String getTargetHeartRate() {
    int maxHeartRate = this.getMaxHeartRate();

    double minTarget = 0.50 * maxHeartRate;
    double maxTarget = 0.85 * maxHeartRate;

    return minTarget + "-" + maxTarget + " beats per minute";
  }
}
