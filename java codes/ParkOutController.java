package Project;


public class ParkOutController {
	
	public ParkOutController(){
		
		FreeSlot fs = new FreeSlot();
		Fees f = new Fees();
		f.clculateFees();
		TotalIncome t = TotalIncome.getInstance();
		t.setFeesIncome(f.getFees());

	}
}
