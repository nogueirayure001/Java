
import java.util.Scanner;

public class GasMiles {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int milesCounter = 0;
    int gallonsCounter = 0;

    System.out.print("Enter gallons consumed: ");
    int gallons = input.nextInt();
    System.out.print("Enter miles driven: ");
    int miles = input.nextInt();

    while (miles > 0) {
      double tripEfficiency = (double) miles / gallons;
      System.out.printf("\nTrip efficiency was %.2f miles/gallons", tripEfficiency);

      gallonsCounter += gallons;
      milesCounter += miles;
      double overallTripEfficiency = (double) milesCounter / gallonsCounter;
      System.out.printf("\nOverall trip efficiency to this point was %.2f miles/gallons%n%n%n", overallTripEfficiency);

      System.out.print("Enter gallons consumed: ");
      gallons = input.nextInt();
      System.out.print("Enter miles driven: ");
      miles = input.nextInt();
    }

    input.close();
  }
}