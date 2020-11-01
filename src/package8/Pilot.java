package package8;

import java.util.Scanner;

public class Pilot extends Employee {
	Scanner sc = new Scanner(System.in);
	int time;
	public void takeOff(){
		System.out.println("Set Time for flight take off (in mins)");
		time = sc.nextInt();
        System.out.println("Flight will be taken off within "+time+ " minutes");
    }

}
