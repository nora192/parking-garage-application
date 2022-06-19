package Project;

import java.util.Date;
import java.util.Scanner;

public class Vehicle {
	
	//Date time = new Date();
	private  String modelname;
	public static int  idnumber;
	private  int  modelyear;
	public static double width;
	public static double depth;
	public static int arrival; 
	
	public void setVehicle(){
		Date time = new Date();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter vehicle information");
		System.out.println("model name: ");
		modelname =in.nextLine();
		System.out.println("identification number: ");
		idnumber = in.nextInt();
		System.out.println("Model year: ");
		modelyear = in.nextInt();
		System.out.println("width: ");
		width = in.nextDouble();
		System.out.println("depth: ");
		depth = in.nextDouble();
		arrival = time.getSeconds();
	}
	
	

}
