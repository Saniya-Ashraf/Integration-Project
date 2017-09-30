// author Saniya Ashraf
package integrationProject;

public class User {
	private String name;
	private	int age;

	public User(String n, int a) {
		name = n;
		age = a;
	}
	
	
	public User(String n) {
		name = n;
	}
	
	public User() {
		name = null;
		age = 0;
	}
	public void setAge(int a) {
		if(a<0)
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
