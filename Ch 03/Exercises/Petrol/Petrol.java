package Exercises.Petrol;

import java.util.Scanner;

public class Petrol {
  private static final Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    final String[] LOCATIONS = { "Posto 01", "Posto 02" };
    final String[] FUELS = { "Gasolina", "Álcool" };
    final double[][] FUEL_PRICES = { { 5.67, 3.45 }, { 5.67, 3.45 } };
    final double[][] DISCOUNTS = { { 13, 18 }, { 10, 20 } };

    int locationCode = chooseLocation();
    int fuelCode = chooseFuel();

    String location = LOCATIONS[locationCode];
    String petrolType = FUELS[fuelCode];
    double price = FUEL_PRICES[locationCode][fuelCode];
    double discount = DISCOUNTS[locationCode][fuelCode];

    System.out.printf("Quantos litros de %s você deseja? ", petrolType);
    int quantity = input.nextInt();

    System.out.println();

    PetrolPurchase myPurchase = new PetrolPurchase(location, petrolType,
        quantity, price, discount);

    System.out.printf("Você comprou %d litros de %s em %s e a conta foi de R$ %.2f!",
        myPurchase.getQuantity(),
        myPurchase.getPetrolType(),
        myPurchase.getLocation(),
        myPurchase.getPrice() * myPurchase.getQuantity());

    System.out.printf("Com %.2f%% de desconto oferecidos, o preço final foi R$ %.2f%n",
        myPurchase.getPercentageDiscount(),
        myPurchase.getPurchasedAmount());

    input.close();
  }

  private static int chooseLocation() {
    int locationCode;

    do {
      System.out.println("Escolha a localidade:");
      System.out.println("0 - Posto 01");
      System.out.println("1 - Posto 02");

      locationCode = input.nextInt();

      if (locationCode != 0 && locationCode != 1) {
        System.out.println("Código invalido, tente novamente.%n");
      }

    } while (locationCode != 0 && locationCode != 1);

    return locationCode;
  }

  private static int chooseFuel() {
    int fuelCode;

    do {
      System.out.println("Escolha um tipo de combustível:");
      System.out.println("0 - Gasolina");
      System.out.println("1 - Álcool");

      fuelCode = input.nextInt();

      if (fuelCode != 0 && fuelCode != 1) {
        System.out.println("Código invalido, tente novamente.%n");
      }

    } while (fuelCode != 0 && fuelCode != 1);

    return fuelCode;
  }

}
