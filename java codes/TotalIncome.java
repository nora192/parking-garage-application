package Project;

public class TotalIncome {
	private int total=0;
	
	public static int [] fees;
	//private TotalIncome(){}
	public int count=0;
	private static TotalIncome instance = null;
	
	public static TotalIncome getInstance(){
		
		if (instance == null){
			instance = new TotalIncome();
		}
		return instance;
	}
	
	public TotalIncome(){
		fees = new int[50];
		}
	public void setFeesIncome(int f){
		
		fees[count] = f;
		count++;
	}
	
	public void calcTotalIncom(){
		for (int i=0; i<count; i++){
			total += fees[i];
			
		}
		
		System.out.println("total income= " + total);
		
	}

}
