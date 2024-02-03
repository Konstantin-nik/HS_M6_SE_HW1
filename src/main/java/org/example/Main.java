package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Main {

  private static void task1() {
    System.out.println("Введите число: ");
    Scanner in = new Scanner(System.in);
    String number = in.next();
    StringBuilder numberBuilder = new StringBuilder();
    numberBuilder.append(number);
    System.out.println(Objects.equals(number, numberBuilder.reverse().toString()));
  }

  private static void task2() {
    System.out.println("Введите последовательность скобочек: ");
    Scanner in = new Scanner(System.in);
    String line = in.next();
    Stack<Character> stack = new Stack<>();
    for(char ch : line.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
        stack.pop();
      } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
        stack.pop();
      } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
        stack.pop();
      } else {
        System.out.println(false);
        return;
      }
    }
    System.out.println(stack.isEmpty());
  }

  public static void main(String[] args) {
    task1();
    task2();
  }
}