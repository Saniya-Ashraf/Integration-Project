//Saniya Ashraf
// this is my first and main class for the integration program

package integrationProject;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("please Enter your name: ");
		String username = in.nextLine();
		System.out.println("Hello " + username);
	}
	public static void calcArea(int length, int width) {
		int area = length * width;
		System.out.println("the area of a rectangle is: " + area);
	}

	
}
