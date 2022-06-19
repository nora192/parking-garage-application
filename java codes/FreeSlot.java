package Project;

import java.util.Scanner;

public class FreeSlot {
	
	public FreeSlot(){
		
		new SlotsController();
		new Driver();
		Scanner in = new Scanner(System.in);
		int slotlocation;
		int id;
		System.out.println("enter identification number: ");
		id = in.nextInt();
		System.out.println("enter slot location: ");
		slotlocation = in.nextInt();
		
		
			
		if( id == Driver.driver_id && slotlocation == Driver.slotloc  ){
			SlotsController.s[slotlocation].availability = true;
		}
		
		SlotsController.getSlots();
		
			
		
		
	}

}
