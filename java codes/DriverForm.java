package Project;

import java.util.Scanner;

public class DriverForm implements ProgramForm{
	
	public void printForm(){
		int driver_choice=0;
		while(driver_choice != 4){
			System.out.println("Driver form:");
			
			Scanner in = new Scanner(System.in);
			System.out.println("1)Park-in");
			System.out.println("2)Park-out");
			System.out.println("3)check-out");
			System.out.println("4)exit");
			
			driver_choice = in.nextInt();
			if(driver_choice == 1){
				ParkInController pi = new ParkInController();
			}
			if(driver_choice == 2){
				ParkOutController po = new ParkOutController();
			}
			if(driver_choice == 2){
				ParkOutController po = new ParkOutController();
			}
			
			if(driver_choice == 3){
				CheckOut co = new CashPayment();
			}
			
			
			
		
		//System.out.println("driver");
	}
}

}
