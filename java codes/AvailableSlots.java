package Project;

public class AvailableSlots {
	
	public void printAvailableSlots(){
		
		for(int i=0; i<SlotsController.slots_num; i++){
			if(SlotsController.s[i].availability == true){
				System.out.println(SlotsController.s[i].width + " x " + SlotsController.s[i].depth);
		}
	}
	}

}
