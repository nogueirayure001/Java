package Exercises.Petrol;

public class PetrolPurchase {
  String location;
  String petrolType;
  int quantity;
  double price;
  double percentageDiscount;

  public PetrolPurchase(
      String location,
      String petrolType,
      int quantity,
      double price,
      double percentageDiscount) {
    this.location = location;
    this.petrolType = petrolType;
    this.quantity = quantity;
    this.price = price;
    this.percentageDiscount = percentageDiscount;

  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPetrolType() {
    return petrolType;
  }

  public void setPetrolType(String petrolType) {
    this.petrolType = petrolType;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity > 0) {
      this.quantity = quantity;
    }
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    }
  }

  public double getPercentageDiscount() {
    return percentageDiscount;
  }

  public void setPercentageDiscount(double percentageDiscount) {
    if (percentageDiscount > 0) {
      this.percentageDiscount = percentageDiscount;
    }
  }

  public double getPurchasedAmount() {
    return price * quantity - price * quantity * percentageDiscount / 100.0;
  }
}
