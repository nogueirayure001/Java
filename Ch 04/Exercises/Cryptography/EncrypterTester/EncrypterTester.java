package Cryptography.EncrypterTester;

import java.util.Scanner;

import Cryptography.Encrypter.Encrypter;

public class EncrypterTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a 4 digit number to encrypt: ");
    int plainCode = input.nextInt();

    int encryptedCode = Encrypter.encrypt(plainCode);

    System.out.printf("%n%04d encrypted is %04d", plainCode, encryptedCode);

    int decryptedCode = Encrypter.decrypt(encryptedCode);

    System.out.printf("%n%04d decrypted is %04d%n", encryptedCode, decryptedCode);

    input.close();
  }
}
