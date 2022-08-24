package Exercises.Car;

import java.util.Scanner;

public class CarApplication {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    prompt("Entre o modelo do primeiro carro: ");
    String model1 = input.nextLine();
    prompt("Entre o ano do primeiro carro: ");
    String year1 = input.nextLine();
    prompt("Entre o preço do primeiro carro: ");
    double price1 = input.nextDouble();

    input.nextLine();

    prompt("Entre o modelo do segundo carro: ");
    String model2 = input.nextLine();
    prompt("Entre o ano do segundo carro: ");
    String year2 = input.nextLine();
    prompt("Entre o preço do segundo carro: ");
    double price2 = input.nextDouble();

    Car car1 = new Car(model1, year1, price1);
    Car car2 = new Car(model2, year2, price2);

    System.out.printf("O carro %s, modelo do ano de %s, custa R$%.2f%n",
        car1.getModel(), car1.getYear(), car1.getPrice());

    System.out.printf("O carro %s, modelo do ano de %s, custa R$%.2f%n",
        car2.getModel(), car2.getYear(), car2.getPrice());

    prompt("Atualize o preço do primeiro carro: ");
    price1 = input.nextDouble();
    car1.setPrice(price1);

    prompt("Atualize o preço do segundo carro: ");
    price2 = input.nextDouble();
    car2.setPrice(price2);

    System.out.printf("O carro %s, modelo do ano de %s, custa R$%.2f%n",
        car1.getModel(), car1.getYear(), car1.getPrice());

    System.out.printf("O carro %s, modelo do ano de %s, custa R$%.2f%n",
        car2.getModel(), car2.getYear(), car2.getPrice());

    double newPrice1 = car1.getPrice() * (1 - 0.05);
    car1.setPrice(newPrice1);

    double newPrice2 = car2.getPrice() * (1 - 0.07);
    car2.setPrice(newPrice2);

    System.out.println("%n Após descontos de 5% e 7%:");

    System.out.printf("O carro %s, modelo do ano de %s, custa R$%.2f%n",
        car1.getModel(), car1.getYear(), car1.getPrice());

    System.out.printf("O carro %s, modelo do ano de %s, custa R$%.2f%n",
        car2.getModel(), car2.getYear(), car2.getPrice());

    input.close();
  }

  public static void prompt(String prompt) {
    System.out.print(prompt);
  }

}
