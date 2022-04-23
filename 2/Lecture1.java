import java.util.Scanner;

public class Lecture1{

	public static void main(String[] args){

		Scanner j = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = j.nextLine();
		System.out.println("Name is : " + name);
		
		System.out.print("Enter age : ");
		int age = j.nextInt();
		System.out.println("Age is : " + age);
		
		System.out.print("Enter Salary : ");
		float salary = j.nextFloat();
		System.out.println("Salary is : " + salary);
		
	}
}