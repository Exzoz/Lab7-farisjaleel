package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    String line = input.nextLine();
    System.out.println(line);
    if (input.hasNextLine()) {
      printReverse(input);
    }
    System.out.println(line);
  }
}

