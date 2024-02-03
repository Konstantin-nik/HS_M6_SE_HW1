package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void task1() {
    System.out.println("Введите число: ");
    Scanner in = new Scanner(System.in);
    String number = in.next();
    StringBuilder numberBuilder = new StringBuilder();
    numberBuilder.append(number);
    System.out.println(Objects.equals(number, numberBuilder.reverse().toString()));

  }

  public static void main(String[] args) {
    task1();
  }
}