package Project;

public class BFA implements ParkIn {
	
	public int exist;
	public void park(){
		
		new SlotsController();
		new Vehicle();
		new Driver();
		for(int i=0; i<SlotsController.slots_num; i++)
		{
			if(SlotsController.s[i].depth == Vehicle.depth && SlotsController.s[i].width == Vehicle.width){
				
				exist = 1;
				System.out.println("the suitable available slot for you is the slot with dimensions:");
				System.out.println(SlotsController.s[i].width + " x " + SlotsController.s[i].depth);
				System.out.println("with location number: "+(i));
				SlotsController.s[i].availability = false;
				Driver.setDriver(Vehicle.idnumber, i);
				
				break;
			}
		
		//System.out.print("FCFS");
		}
		if(exist != 1){
			System.out.println("NO available slots suitable for your car dimensions..");
		}
		SlotsController.getSlots();
	}
		
		
		//System.out.print("BFA");
	}

