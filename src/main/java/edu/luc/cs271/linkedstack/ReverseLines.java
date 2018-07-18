package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {

    //This will read successive input lines until EOF, then prints out in reverse order
    //Input can be halted using CTRL + Z

    final Scanner input = new Scanner(System.in);
    LinkedStack<String> stack = new LinkedStack<String>();
    while (input.hasNextLine()) {
      final String line = input.nextLine();
      stack.push(line);

    }
    // This prints in reverse order
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }

  }
}
