package Project;

public class Slots {
	public double width;
	public double depth;
	public boolean availability;
	
	public Slots(double w,double d){
		this( w, d,true);
		/*width =  w;
		depth = d;*/
	}
	public Slots(double w,double d,boolean b){
		width =  w;
		depth = d;
		availability = b;
		
	}

}
