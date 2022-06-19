package Project;
import java.util.Date;

public class Fees {
	
	private int totalfees = 0;
	Date time = new Date();
	private int departure;
	
	public void clculateFees(){
		new Vehicle();
		departure = time.getSeconds();
		totalfees = (departure- Vehicle.arrival) * 5;
		System.out.println("totat fees = " + totalfees);
	}
	
	public int getFees(){
		return totalfees;
	}
	
	
			

}
