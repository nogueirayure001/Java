package PerfectNumber;

public class PerfectNumber {
  public static void main(String[] args) {
    System.out.println("Perfect Numbers: ");

    for (int i = 2; i < 1000000; i++) {
      isPerfect(i);
    }
  }

  public static boolean isPerfect(int num) {
    String factors = "1";
    int sumOfFactors = 1;
    int divisor = 2;

    int limit = (int) Math.floor(num / 2.0);

    while (divisor <= limit) {
      if (num % divisor == 0) {
        factors += " + " + divisor;
        sumOfFactors += divisor;
      }

      divisor++;
    }

    if (sumOfFactors == num) {
      System.out.printf("%n%s = %d %n", factors, num);

      return true;
    }

    return false;
  }
}
