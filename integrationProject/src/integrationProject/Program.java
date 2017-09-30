//Saniya Ashraf
// this is my first and main class for the integration program

package integrationProject;
import java.util.Scanner;

public class Program {
	static Scanner in  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("please Enter your name: ");
		String username = in.nextLine();
		User user1 = new User(username);
		System.out.println("Hello " + username + "\n Welcome to your dashboard"
				+ "\nEnter the number for what you want to do");
	
		System.out.println(" 1:\t Demonstrate Integer Division in Java"
							+"\n 2:\t Set your name"
							+"\n 3:\t Set your age"
							+ "\n 4:\t Get your name and age"
							+ "\n 5:\t Enter into a virtual Calculator");
		int choice =  in.nextInt();
		
		switch(choice) {
		case 1:
			demonstrateIntDiv();
			break;
		case 2:
			System.out.println("Enter your name: ");
			String name = in.nextLine();
			user1.setName(name);
			break;
		case 3:
			System.out.println("Enter your age: ");
			int age = in.nextInt();
			user1.setAge(age);
			break;
		case 4:
			if (user1.getAge() == 0) {
				System.out.println("age not set");
			}
			else
				System.out.println("Your name is "+ user1.getName() +" Your age is " + user1.getAge());
			break;
			
			
			
		}
	}
	
	
	
	public static void demonstrateIntDiv() {
	
	
		System.out.println("Enter the first integer");
		int int1 = in.nextInt();
		System.out.println("Enter the Second integer");
		int int2 = in.nextInt();
		int intResult = int1/int2;
		double res = (double)int1/int2;
		System.out.printf("\n\n\nThe values you enter are %d and %d\n But a Funny part is"
				+ " you cant really divide two integers and get the correct value\n "
				+ "the value you will get is %d\n"
				+ " So there are actually two ways to fix it\n"
				+ " one is casting  which is explicit datatype convertion\n"
				+ " other is converting one of the integers into a double then you'd have to change"
				+ "  the main storing variable to double as well.\n"
				+ " So we fixed it! and your result is %.2f",int1,int2,intResult,res);
	
		
	}
	
}
