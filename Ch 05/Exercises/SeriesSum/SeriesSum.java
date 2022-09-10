package SeriesSum;

public class SeriesSum {
  public static void main(String[] args) {
    long sum = 0;

    System.out.println("n\tsum");

    for (int n = 1; n <= 100; n++) {
      sum += n;
      System.out.printf("%d\t%d%n", n, sum);
    }

  }
}
