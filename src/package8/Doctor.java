package package8;

import java.util.Scanner;

public class Doctor extends Employee{
		int appointment;
		Scanner sc = new Scanner(System.in);
	    public void appointments(){
	    	System.out.println("Book Appointment (1 for Yes , 0 for No) ");
	    	appointment = sc .nextInt();
	    	if(appointment==1)
	    	{
	    		System.out.println("Your appointment is booked with "+name);
	    	}
	    	else
	    	{
	    		System.out.println("You didnot book  appointment with "+name);
	    	}
	    }

	    
	}
	
