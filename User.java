/**
 * a variable is code it is a virtual container in the memory that can
 * hold a value of a certain type. there are 8 primitive datatypes
 * boolean its either true or false byte - its a two'scomplement
 * integer value of 8 bits char - is any single unicode character
 * short - twos complement integer of 16 bits int - twos complement
 * integer of 32 bits long - twos complement integer of 64 bits float
 * - is a floating point of 32 bits double - floating point of 64 bits
 */

package integration;

/**
 * a simple class that stores the basic information about the user of
 * the program.
 * 
 * @author Saniya Ashraf
 */
public class User {
  private String name;
  private int age;

  /**
   * constructor with 2 parameters.
   * 
   * @param n to set name
   * @param a to set age
   */
  public User(String n, int a) { // constructor
    name = n;
    age = a;
  }


  /**
   * constructor with 1 parameter.
   * 
   * @param n to set name
   */
  public User(String n) { // constructor
    name = n;
  }


  /**
   * setter for age.
   * 
   * @param a to set age of the person.
   */
  public void setAge(int a) {
    if (a > 0) {
      age = a;
    } else {
      System.out.println("Invalid Age");
    }
  }

  /**
   * getter for Age.
   * 
   * @return age of the person.
   */
  public int getAge() {
    if (age > 0) {
      return age;
    } else {
      return 0;
    }
  }

  /**
   * setter for the name.
   * 
   * @param n to set the name.
   */
  public void setName(String n) {
    name = n;
  }

  /**
   * getter for the name;
   * 
   * @return name of the person.
   */
  public String getName() {
    return name;
  }

}
