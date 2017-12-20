/**
 * @author Saniya Ashraf
 */

package integration;

import java.util.HashMap;
import java.util.Map.Entry;
/*
 * checkstyle Is showing some weird errors like close else where ther
 * is no else and javadoc errors where there is no javadoc
 */

public class Calculator {

  /**
   * . a function to calculate the total area of a rectangle
   * 
   * @param length used for length
   * @param width used for width
   */
  public void calcAreaRect(double length, double width) {
    double area = length * width;
    System.out.println("the area of a rectangle is: " + area);
  }

  public double add(double a, double b) {
    return a + b;
  }

  /**
   * .
   * 
   * @param a for number 1
   * @param b for number 2
   * @return subtracted number
   */
  public double subtract(double a, double b) {
    return a - b;
  }

  /**
   * .
   * 
   * @param a for number 1
   * @param b for number 2
   * @return multiplied number
   */
  public double multiply(double a, double b) {
    return a * b;
  }

  /**
   * .
   * 
   * @param a for number 1
   * @param b for number 2
   * @return the divided num
   */
  public double divide(double a, double b) {
    if (b != 0) {
      return a / b;
    } else {
      System.out.println("Cannot divide");
      return 0;
    }
  }

  /////// Header with three parameters //////
  /**
   * . a function to calculate interest given on
   * 
   * @param amount to represent amount
   * @param rate to represent the rate of interest
   * @param year for how many years
   */
  public void calcInterest(int amount, double rate, int year) {

    double yearlyInterestPaid;
    double totalAmount = amount;

    System.out.println(amount + " :- "
        + " grows with the interest rate of " + rate);

    //// Use of Relational less than equal to operator////
    //// FOR LOOP ////
    for (int i = 0; i <= year; i++) {

      yearlyInterestPaid = totalAmount * rate;
      totalAmount += yearlyInterestPaid;
      System.out.println(i + "   " + totalAmount);
    }
  }

  /**
   * .
   * 
   * @param arr for array
   * @return the minimum value
   */
  public int minNumber(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }

    }
    return min;
  }

  /**
   * .
   * 
   * @param arr for array
   * @return the sum value
   */
  public int arrTotal(int[] arr) {
    int total = 0;
    for (int i = 1; i < arr.length; i++) {
      total += arr[i];
    }
    return total;
  }

  /**
   * . find a number in an automatically generated list
   * 
   * @param num to find the number in the list
   */
  public void findNumber(int num) {
    System.out.println("generating a list...");
    int[] ar3 = new int[20];
    for (int i = 0; i < ar3.length; i++) {
      ar3[i] = (int) (Math.random() * 100);
    }
    int index = -1;
    int i = 0;
    System.out.println("Finding the number");
    while (index == -1) {
      if (num == ar3[i]) {
        index = i;
      }
    }
    if (index > 0) {
      System.out.println("Not found!");
    } else {
      System.out.println("Found at index: " + index);

    }
  }

  /**
   * . shows the implementation of hashmaps storing names(strings) with
   * ids(int)
   */
  public void hashMapImplementation() {
    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    hm.put(100, "Saniya");
    hm.put(101, "Michael");
    hm.put(102, "Chris");
    hm.put(103, "Joe");
    System.out.println("Demonstrating HashMap...");
    for (Entry<Integer, String> m : hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
  }
}
