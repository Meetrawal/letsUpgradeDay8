package package8;

import java.util.Scanner;

public class Employee {
	public String name;
	int age;
	double salary;
	String designation;
	
	Scanner sc = new Scanner(System.in);
	
	public void getData()
	{
		System.out.print("Enter Name : ");
		name=sc.nextLine();
		System.out.print("Enter Age : ");
		age=sc.nextInt();
		System.out.print("Enter Annual Salary  : ");
		salary=sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter Designation : ");
		designation=sc.nextLine();
	}
	public void displayData()
	{
		System.out.println("Employee Data");
		System.out.println("Name  - "+name);
		System.out.println("Age  - "+age+" year old");
		System.out.println("Salary  - "+name+ " per annum");
		System.out.println("Desgnation  - "+designation);
	}
}
