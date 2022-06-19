package Project;

public class ParkInController {
	
	public ParkInController(){
		
		
		Vehicle v1= new Vehicle();
		v1.setVehicle();
		
		new Configrations();
		
		if(Configrations.getconfg() == 1){
			ParkIn p = new FCFS();
			p.park();
		}
		else if(Configrations.getconfg() == 2){
			ParkIn p = new BFA();
			p.park();
		}
		else{
			System.out.println("Error ha sbeen occured..");
		}
		
		
	}
	

}
