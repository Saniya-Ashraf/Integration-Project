//@author Saniya Ashraf
// this is my first and main class 
//for the integration program
/* this program is a dashboard program when you enter it 
 * asks you for your name and then displays a set of options
 * that you can do then you basically choose and it will
 * ask you if you want to return to the options
 */
package integrationProject;
import java.util.Scanner;

public class Program {
	static Scanner in  = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("please Enter your name: ");
		String username = in.nextLine();
		boolean flag2 = true; //for first while
	User user1 = new User(username); //creating an object with a constructor
 while(flag2) {
		System.out.println("Hello " + username + "\n Welcome to your dashboard"
				+ "\nEnter the number for what you want to do");
	
		System.out.println(" 1:\t Demonstrate Integer Division in Java"
							+"\n 2:\t Set your name"
							+"\n 3:\t Set your age"
							+ "\n 4:\t Get your name and age"
							+ "\n 5:\t Enter into a virtual Calculator");
		int choice =  in.nextInt();
		boolean flag = true; //for do while statement 
		char temp; // used in switch  
		switch(choice) { //switch 1 main switch statement
		case 1:
			demonstrateIntDiv(); // this is a method call to a static method in the same class with no arguments
			System.out.println("Do you wanna head back? (y/n)? ");
			 temp = in.next().charAt(0);
			if(temp=='n' || temp=='n')
				flag2 = false;
			break;
		case 2:
			System.out.println("Enter your name: ");
			String name = in.next();
			user1.setName(name);
			
			System.out.println("Do you wanna head back? (y/n)? ");
			 temp = in.next().charAt(0);
			if(temp=='n' || temp=='n')
				flag2 = false;
			break;
		case 3:
			System.out.println("Enter your age: ");
			int age = in.nextInt();
			user1.setAge(age);
			
			System.out.println("Do you wanna head back? (y/n)? ");
			 temp = in.next().charAt(0);
			if(temp=='n' || temp=='n')
				flag2 = false;
			break;
		case 4:
			if (user1.getAge() == 0) {
				System.out.println("age not set");
			}
			else
				System.out.println("Your name is "+ user1.getName() +" Your age is " + user1.getAge());
			
			System.out.println("Do you wanna head back? (y/n)? ");
			 temp = in.next().charAt(0);
			if(temp=='n' || temp=='n')
				flag2 = false;
			
			break;
		case 5:
			System.out.println("Welcome to the Calculator"
					+ " What do you want to do?");
		do {
			System.out.println(" 1:\t Add"
					+"\n 2:\t Subtract"
					+"\n 3:\t Multiply"
					+ "\n 4:\t Divide"
					+ "\n 5:\t Calculate Area of a rectangle");
			Calculator c1 = new Calculator();
			int calChoice =in.nextInt();
			switch(calChoice) {
			case 1: 
				System.out.print("Enter the first number: ");
				double a1 = in.nextDouble();
				System.out.print("Enter the Second number: ");
				double a2 = in.nextDouble();
				System.out.println("The Result is: "+ c1.add(a1, a2));
				break;
			case 2:
				System.out.print("Enter the first number: ");
				double b1 = in.nextDouble();
				System.out.print("Enter the Second number: ");
				double b2 = in.nextDouble();
				System.out.println("The Result is: "+ c1.subtract(b1, b2));
				break;
			case 3:
				System.out.print("Enter the first number: ");
				double c3 = in.nextDouble();
				System.out.print("Enter the Second number: ");
				double c2 = in.nextDouble();
				System.out.println("The Result is: "+ c1.multiply(c3, c2));
				break;
			case 4:
				System.out.print("Enter the first number: ");
				double d1 = in.nextDouble();
				System.out.print("Enter the Second number: ");
				double d2 = in.nextDouble();
				System.out.println("The Result is: "+ c1.divide(d1, d2));
				break;
			case 5:
				System.out.print("Enter the length: ");
				double e1 = in.nextDouble();
				System.out.print("Enter the width: ");
				double e2 = in.nextDouble();
				c1.calcAreaRect(e1,e2);
				break;
			case 6:
				int amount;
				double rate;
				int year;
				System.out.print("Enter the amount paid: ");
				amount = in.nextInt();
				System.out.print("Enter the rate: ");
				rate = in.nextDouble();
				System.out.print("Enter the years: ");
				year = in.nextInt();
				c1.CalcInterest(amount, rate, year); //this is a method call with 3 arguments to another class's method
				System.out.println("Do you wanna do more calculations or head back? (y/n)? ");
				char c = in.next().charAt(0);
				
				if(c=='y' || c=='Y')
					flag = false;
				}	
				}while(!flag);
			}
		}
		
				
			
			
		
		
 
 System.out.println(" Thank you for using This application have a nice Day!");
	}
	
	public static void demonstrateIntDiv() { //this is a header with no paramenters
	
		System.out.println("Enter the first integer");
		int int1 = in.nextInt();
		System.out.println("Enter the Second integer");
		int int2 = in.nextInt(); //nextInt() is a method call to a predefined method
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

