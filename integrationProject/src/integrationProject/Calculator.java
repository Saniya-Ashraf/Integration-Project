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
}
