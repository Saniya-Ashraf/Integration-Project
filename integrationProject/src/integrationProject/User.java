// @author Saniya Ashraf

// a variable is code
// it is a virtual container in the memory that can
//hold a value of a certain type.
// there are 8 primitive datatypes
/* boolean its either true or false
 * byte - its a two's complement integer value of 8 bits
 * char - is any single unicode character
 * short - twos complement integer of 16 bits
 * int - twos complement integer of 32 bits
 * long - twos complement integer of 64 bits
 * float - is a floating point of 32 bits
 * double - floating point of 64 bits
 */
package integrationProject;

public class User {
	private String name;
	private	int age;

	public User(String n, int a) { //constructor 
		name = n;
		age = a;
	}
	
	
	public User(String n) { //constructor 
		name = n;
	}
	

	public void setAge(int a) {
		if(a>0)
			age = a;
		else
			System.out.println("Invalid Age");
	}
	
	public int getAge() {
		if (age>0)
		return age;
		else {	
		return 0;
		}
	}
	
	public void setName(String n) {
			name = n;
	}
	
	public String getName() {
		return name;
	}

}
