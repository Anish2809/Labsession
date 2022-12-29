/*Q1 Write a program take the input of age from the user if the age is above
 18 print 'You are eligible to vote' else throw an exception that 'age is not
 correct 
 */

/*Explanation :- In this java code we are taking  user input to see whether the 
 * user is eligible for vote or not
 */


package prac_29_12_22;


import java.util.Scanner;

public class Q1_VoteEligibilityCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    if (age >= 18) {
      System.out.println("You are eligible to vote");//Taking input
    } else {
      throw new IllegalArgumentException("Age is not correct");//Throwing exception when user>18
    }
  }
}
