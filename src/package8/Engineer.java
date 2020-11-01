package package8;

import java.util.Scanner;

public class Engineer extends Employee{
	Scanner sc = new Scanner(System.in);
	int noOfProject;
	public void noOfProjectDone(){
        System.out.println(name+" had done "+ noOfProject+" projects");
    }
    void setNoOfProject(){
    	System.out.println("Enter Number of Project "+name+" had  done");
    	noOfProject=sc.nextInt();
    }

}
