package Exercises.Account;

import java.util.Scanner;

public class AccountTest {

  public static void main(String[] args) {
    Account account1 = new Account("Jane Green", 50.00);
    Account account2 = new Account("John Blue", -7.59);

    displayAccount(account1);
    displayAccount(account2);

    Scanner input = new Scanner(System.in);

    System.out.print("Enter deposit amount for account 1: ");
    double depositAmount = input.nextDouble();
    System.out.printf("%nadding %.2f to account1 balance%n%n",
        depositAmount);
    account1.deposit(depositAmount);

    displayAccount(account1);
    displayAccount(account2);

    System.out.print("Enter deposit amount for account 2: ");
    depositAmount = input.nextDouble();
    System.out.printf("%nadding %.2f to account2 balance%n%n",
        depositAmount);
    account2.deposit(depositAmount);

    displayAccount(account1);
    displayAccount(account2);

    System.out.print("Enter withdrawal amount for account 1: ");
    double withdrawAmount = input.nextDouble();
    System.out.printf("%nsubtracting %.2f from account1 balance%n%n",
        withdrawAmount);
    account1.withdraw(withdrawAmount);

    displayAccount(account1);
    displayAccount(account2);

    System.out.print("Enter withdrawal amount for account 2: ");
    withdrawAmount = input.nextDouble();
    System.out.printf("%nsubtracting %.2f from account2 balance%n%n",
        withdrawAmount);
    account2.withdraw(withdrawAmount);

    displayAccount(account1);
    displayAccount(account2);

    input.close();
  }

  public static void displayAccount(Account account) {
    System.out.printf("%s balance: $%.2f%n", account.getName(),
        account.getBalance());
  }
}