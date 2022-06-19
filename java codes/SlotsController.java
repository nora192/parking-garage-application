package Project;

import java.util.Scanner;

public class SlotsController {
	
	public static Slots[] s;
	public static int slots_num; 
	
	public static void setSlots(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of slots");
		slots_num = in.nextInt();
		//Slots[] s;
		s = new Slots[slots_num];
		double w,d;
		for (int i=0; i<slots_num; i++){
			
			System.out.println("Enter width of slot "+(i+1));
			w = in.nextDouble();
			System.out.println("Enter depth of slot "+(i+1));
			d = in.nextDouble();
			s[i] = new Slots(w,d);
		}
		
		
	}
	
	public static void getSlots(){

		for (int i=0; i<slots_num; i++){
			System.out.println("Slot"+(i+1)+"dimensions: " + s[i].width + " x " + s[i].depth + " " + s[i].availability);
			
		}
	}
	
	
}
