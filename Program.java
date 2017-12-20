/**
 * this is my first and main class for the integration program this
 * program is a dashboard program when you enter it asks you for your
 * name and then displays a set of options that you can do then you
 * basically choose and it will ask you if you want to return to the
 * options An important thing to note in this program is nextInt and
 * nextDouble are not used. because at the time when the exception is
 * caused they will not read the token again and pass the original
 * one, hence making it run an infinite loop when the data needs to be
 * entered again. and since the exception caused would be by parsing
 * its catched by the general Exception class rather than
 * inputmismatch class.
 */

package integration;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Saniya Ashraf.
 */
public class Program {
  static Scanner input = new Scanner(System.in);

  /**
   * @param args the main function.
   */
  public static void main(String[] args) {

    try {
      System.out.print("please Enter your First name: ");
      String fname = input.nextLine();
      System.out.print("please Enter your Last name: ");
      String lname = input.nextLine();

      boolean flag2 = true; // for first while

      //// creating an object with a constructor////
      User user1 = new User(fname + " " + lname);
      //// WHILE LOOP ////
      while (flag2) {
        // Displaying initials//
        try {
          System.out.println("\nHello " + fname.toUpperCase().charAt(0)
              + lname.toUpperCase().charAt(0)
              + "\n\n Welcome to your dashboard"
              + "\nEnter the number for what you want to do");
        } catch (StringIndexOutOfBoundsException emptyString) {
          System.out.println("Welcome to your dashboard"
              + "\nEnter the number for what you want to do\n");
        }



        System.out.print(
            "\n 1:\t Demonstrate Integer Division in Java"
                + "\n 2:\t Play Tic Tac Toe"
                + "\n 3:\t Set your name"
                + "\n 4:\t Set your age"
                + "\n 5:\t Get your name and age"
                + "\n 6:\t Check to see if your name is a palindrome"
                + "\n 7:\t see how many players are there in a soccer "
                + "\n 8:\t Enter into a virtual Calculator"
                + "\n\nYour choice:");


        int choice = input.nextInt();
        boolean flag = true; // for do while statement

        //// switch 1 main switch statement /////
        char temp;
        boolean caseDone;
        switch (choice) {
          case 1:

            try {
              demonstrateIntDiv();
            } catch (Exception e) {
              System.out.println("Well We did not expect this, "
                  + "oh well.\nThe error occured is: " + e);
            } // static method in the same class


            break;
          case 2:

            System.out.println("\nWelcome to the Tic Tac Toe! lets begin.");
            // Create game and initialize it.
            // First player will be 'x'
            TicTacToe game = new TicTacToe();
            boolean playerFlag = true;
            while (!game.checkForWin() || !game.isBoardFull()) {
              caseDone = false;
              if (playerFlag) {
                System.out.println("Player: X ");
              } else {
                System.out.println("Player: O ");
              }
              while (!caseDone) {
                try {
                  System.out
                      .print("Coordinate for the top left corner is (1,1);"
                          + "\nEnter the first coordinate: ");
                  int mark1 = Integer.parseInt(input.next());
                  System.out.print("\nEnter the second coordinate: ");
                  int mark2 = Integer.parseInt(input.next());
                  if (mark1 >= 0 && mark1 <= 3
                      && mark2 >= 0 && mark2 <= 3) {
                    game.placeMark(mark1 - 1, mark2 - 1);
                  } else {
                    System.out.println("Please Enter a value "
                        + "between 0 - 2 next time,"
                        + "you lose your turn!");
                  }

                  caseDone = true;

                } catch (NumberFormatException wrongData) {
                  System.out.println("Wrong Format! Please Enter numbers\n.");

                }
              }
              game.printBoard();

              if (game.checkForWin()) {
                System.out.println("We Have a winner!\n"
                    + "Winner is: " + (playerFlag ? "X" : "O"));
                System.exit(0);
              } else if (game.isBoardFull()) {
                System.out.println("Appears we have a draw!");
                System.exit(0);
              }
              game.changePlayer();
              if (playerFlag) {
                playerFlag = false;
              } else {
                playerFlag = true;
              }

            }


            break;
          case 3:

            System.out.println("Enter your first name: ");
            fname = input.next();
            System.out.println("Enter your last name: ");
            lname = input.next();
            user1.setName(fname + " " + lname);

            break;
          case 4:

            System.out.println("Enter your age: ");

            try {
              int age = Integer.parseInt(input.next());
              user1.setAge(age);

            } catch (Exception wrongType) {
              System.out
                  .println("Please Enter your Age"
                      + " in the correct format");
            }

            break;
          case 5:
            ///// If else /////////
            if (user1.getAge() == 0) {
              System.out.println("Your name is " + user1.getName()
                  + ".\nYour age is not set! ");
            } else {
              System.out
                  .println("Your name is " + user1.getName()
                      + ".\nYour age is " + user1.getAge());
            }
            break;
          case 6:
            caseDone = false;
            do {
              if (fname.isEmpty()) {
                System.out.print("\nYou didn't enter your name"
                    + "\nPlease Enter your first Name: ");
                fname = input.next();
              }
              System.out.println("Enter 1 if you want to do "
                  + "it  VIA strings"
                  + " \nEnter 72 if you want to do it VIA "
                  + "stacks and queues");
              try {
                int ch = Integer.parseInt(input.next());
                if (ch == 1) {
                  char[] nameCheck = new char[fname.length()];
                  int j = 0;
                  String palindrome = "";
                  for (int i = fname.length() - 1; i >= 0; i--) {
                    nameCheck[j] = fname.charAt(i);
                    palindrome += nameCheck[j];
                    j++;
                  }
                  if (palindrome.equalsIgnoreCase(fname)) {
                    System.out.println("Your name is a Palindrome");
                  } else {
                    System.out.println("Your name is not a Palindrome");
                  }
                } else {
                  Palindrome p = new Palindrome();
                  char[] s = fname.toCharArray();
                  for (char c : s) {
                    p.pushCharacter(c);
                    p.enqueueCharacter(c);
                  }

                  boolean isPalindrome = true;
                  for (int i = 0; i < s.length / 2; i++) {
                    if (p.popCharacter() != p.dequeueCharacter()) {
                      isPalindrome = false;
                      break;
                    }
                  }
                  System.out.println("Your First name " + fname
                      + ", is "
                      + ((!isPalindrome) ? "not a palindrome."
                          : "a palindrome."));
                }
                caseDone = true;
              } catch (Exception wrongType) {
                System.out.println(
                    "You entered wrong data, Enter correct format please\n.");
              }
            } while (!caseDone);

            break;
          case 7:
            Sports s = new Soccer();
            s.getNumberOfTeamMembers();
            break;
          case 8:

            System.out.println(
                "Welcome to the Calculator"
                    + " What do you want to do?");
            caseDone = false;
            do {
              System.out.println(" \n1:\t Add"
                  + "\n 2:\t Subtract"
                  + "\n 3:\t Multiply"
                  + "\n 4:\t Divide"
                  + "\n 5:\t Calculate Area of a rectangle"
                  + "\n 6:\t Find interest"
                  + "\n 7:\t Find the smallest number in a list"
                  + "\n 8:\t Find total of a random list "
                  + "\n 9:\t Find a value in a random list"
                  + "\n 10:\t Hash map demonstration"
                  + "\n");
              Calculator c1 = new Calculator();
              try {
                int calChoice = Integer.parseInt(input.next());
                switch (calChoice) {
                  case 1:
                    System.out.print("Enter the first number: ");
                    double a1 = Double.parseDouble(input.next());
                    System.out.print("Enter the Second number: ");
                    double a2 = Double.parseDouble(input.next());
                    System.out.println("The Result is: "
                        + c1.add(a1, a2));
                    break;
                  case 2:
                    System.out.print("Enter the first number: ");
                    double b1 = Double.parseDouble(input.next());
                    System.out.print("Enter the Second number: ");
                    double b2 = Double.parseDouble(input.next());
                    System.out
                        .println("The Result is: "
                            + c1.subtract(b1, b2));
                    break;
                  case 3:
                    System.out.print("Enter the first number: ");
                    double c3 = Double.parseDouble(input.next());
                    System.out.print("Enter the Second number: ");
                    double c2 = Double.parseDouble(input.next());
                    System.out
                        .println("The Result is: "
                            + c1.multiply(c3, c2));
                    break;
                  case 4:
                    System.out.print("Enter the first number: ");
                    double d1 = Double.parseDouble(input.next());
                    System.out.print("Enter the Second number: ");
                    double d2 = Double.parseDouble(input.next());
                    System.out.println("The Result is: "
                        + c1.divide(d1, d2));
                    break;
                  case 5:
                    System.out.print("Enter the length: ");
                    double e1 = Double.parseDouble(input.next());
                    System.out.print("Enter the width: ");
                    double e2 = Double.parseDouble(input.next());
                    c1.calcAreaRect(e1, e2);
                    break;
                  case 6:
                    System.out.print("Enter the amount paid: ");
                    int amount = Integer.parseInt(input.next());
                    System.out.print("Enter the rate: ");
                    double rate = Double.parseDouble(input.next());
                    System.out.print("Enter the years: ");
                    int year = input.nextInt();
                    c1.calcInterest(amount, rate, year);
                    // this is a method call
                    // with 3 arguments to
                    // another // class's
                    // method
                    break;
                  case 7:
                    System.out.println("Enter the values in the list");

                    int[] ar1 = new int[10];
                    for (int i = 0; i < ar1.length; i++) {
                      ar1[i] = input.nextInt();
                    }
                    System.out.println("The smallest number is: "
                        + c1.minNumber(ar1));

                    break;
                  case 8:
                    System.out.println("generating a list...");
                    int[] ar2 = new int[20];
                    for (int i = 0; i < ar2.length; i++) {
                      ar2[i] = (int) (Math.random() * 100);
                      System.out.print(ar2[i] + " ");
                    }
                    System.out.println("the total of the list is: "
                        + c1.arrTotal(ar2));
                    break;
                  case 9:
                    System.out.print("Enter a number to find");
                    int num = input.nextInt();
                    c1.findNumber(num);
                    break;
                  case 10:
                    c1.hashMapImplementation();
                    break;
                  default:
                    break;
                }
                System.out.println("Do you wanna do more calculations"
                    + "(y/n)? ");
                char c = input.next().charAt(0);

                if (c == 'y' || c == 'Y') {
                  flag = false;
                }

              } catch (NumberFormatException wrongType) {
                System.out.println("Wrong Input Try again.");
              }
            } while (!flag);
            break;
          default:
            break;

        }
        System.out.println("\nDo you wanna head back? (y/n)? ");
        temp = input.next().charAt(0);

        //////// Ternary operator///////////////
        flag2 = (temp == 'N' || temp == 'n') ? false : true;
      }

    } catch (InputMismatchException e) {
      System.out.println("wrong Input type! try again");
    } catch (Exception e) {
      System.out.println("Oops Found an "
          + "error that shouldnt have been found:"
          + "terminating execution... \n\n" + e);
    } finally {
      System.out.println(" Thank you for using "
          + "This application have a nice Day!");
    }
  }

  /**
   * a method to demonstrate Integer division.
   */
  // this is a header
  public static void demonstrateIntDiv() {
    boolean done = false;
    do {
      try {

        System.out.println("Enter the Divident integer");
        int int1 = Integer.parseInt(input.next());

        System.out.println("Enter the divisor integer");
        int int2 = Integer.parseInt(input.next());
        int intResult = int1 / int2;
        double res = (double) int1 / int2;
        System.out.printf(
            "\n\n\nThe values you enter are %d and %d\n But a Funny part is"
                + " \nyou cant really divide two integers and get "
                + "\nthe correct value "
                + "\nthe value you will get is %d"
                + " \nSo there are actually two ways to fix it"
                + " \none is casting  which is explicit datatype"
                + " convertion\n"
                + " \nother is converting one of the integers into "
                + " \na double then you'd have to change"
                + " \nthe main storing variable to double as well."
                + " \nSo we fixed it! and your result is %.2f",
            int1, int2, intResult, res);
        done = true;

      } catch (ArithmeticException wrongCalc) {
        System.out.println("You attempted to divide by zero! Try again.");
      } catch (Exception wrongType) {
        System.out.println("Wrong Input, Try again.");
      }
    } while (!done);
  }
}
