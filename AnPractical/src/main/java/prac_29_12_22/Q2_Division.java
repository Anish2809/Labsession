/*Q2 Write down a program where you take input of 2 numbers(i,j) from the 
 user and divide the first number with second. Include exception handling
 mechanism 
 */


/**Explanation :- In this java code we are taking  user input of
 *  two numbers from the user and divides the first number by the second, with exception handling
 */




package prac_29_12_22;

import java.util.Scanner;

public class Q2_Division {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int i = sc.nextInt();
    System.out.println("Enter the second number: ");
    int j = sc.nextInt();

    try {
      int result = i / j;
      System.out.println("The result is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero is not allowed");
    }
  }
}
