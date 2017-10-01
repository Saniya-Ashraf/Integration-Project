//@author Saniya Ashraf
package integrationProject;

public class Calculator {
	
	public void calcAreaRect(double length, double width) {
		double area = length * width;
		System.out.println("the area of a rectangle is: " + area);
	}
	
	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
	if(b != 0)	
		return a / b;
	else {
		System.out.println("Cannot divide");
		return 0;
		}
	}
	
	public void CalcInterest(int amount, double rate, int year){ //this is a header with 3 parameters.

		  double yearlyInterestPaid ;
		  double totalAmount = amount;


		  System.out.println(amount + " :- " + " grows with the interest rate of " + rate);

		  for (int i = 0; i <= year; i++ ){

		    yearlyInterestPaid = totalAmount * rate;
		    totalAmount += yearlyInterestPaid;
		    System.out.println(i + "   " + totalAmount);
		  }
		}
}
