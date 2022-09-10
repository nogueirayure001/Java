package Cryptography.Encrypter;

public class Encrypter {
  public static int encrypt(int plainCode) {
    int encryptedCode = 0;

    int first, second, third, fourth, helper;

    fourth = plainCode % 10;
    third = (plainCode / 10) % 10;
    second = (plainCode / 100) % 10;
    first = (plainCode / 1000) % 10;

    fourth = (fourth + 7) % 10;
    third = (third + 7) % 10;
    second = (second + 7) % 10;
    first = (first + 7) % 10;

    helper = third;
    third = first;
    first = helper;

    helper = fourth;
    fourth = second;
    second = helper;

    encryptedCode += fourth + third * 10 + second * 100 + first * 1000;

    return encryptedCode;
  }

  public static int decrypt(int encryptedCode) {
    int plainCode = 0;

    int first, second, third, fourth, helper;

    fourth = encryptedCode % 10;
    third = (encryptedCode / 10) % 10;
    second = (encryptedCode / 100) % 10;
    first = (encryptedCode / 1000) % 10;

    if (fourth >= 7) {
      fourth = fourth - 7;
    } else {
      fourth = fourth + 3;
    }

    if (third >= 7) {
      third = third - 7;
    } else {
      third = third + 3;
    }

    if (second >= 7) {
      second = second - 7;
    } else {
      second = second + 3;
    }

    if (first >= 7) {
      first = first - 7;
    } else {
      first = first + 3;
    }

    helper = third;
    third = first;
    first = helper;

    helper = fourth;
    fourth = second;
    second = helper;

    plainCode += fourth + third * 10 + second * 100 + first * 1000;

    return plainCode;
  }
}
