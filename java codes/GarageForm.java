package Project;

import java.util.Scanner;

public class GarageForm implements ProgramForm {
	
	public void printForm(){
		
		for (int i=0; i<3; i++){
			System.out.println("Garage owner form:");
			
			int ownerchoice;
			Scanner in = new Scanner(System.in);
			System.out.println("1)setup: ");
			System.out.println("2)total income:");
			System.out.println("3)available slots:");
			
			ownerchoice = in.nextInt();
		
		if (ownerchoice == 1){
			ConfigController c_cont = new ConfigController();
			SlotsController s_cont = new SlotsController();
			s_cont.setSlots();
			s_cont.getSlots();
			
			ProgramForm userform = new DriverForm();
			userform.printForm();
		}
		else if(ownerchoice == 2){
			
			IncomController ic = new IncomController();
		}
		
		else if(ownerchoice == 3){
			
			AvailableController ac = new AvailableController();
		}
		
		/*else if (ownerchoice == 3){
			SlotsController s_cont = new SlotsController();
			s_cont.setSlots();
			s_cont.getSlots();
		}*/
		}
		
	}

}
