package Project;

import java.util.Scanner;

public class ConfigController {
	
	public ConfigController(){
		Scanner in = new Scanner(System.in);
		int cnfg;
		System.out.println("enter configration number(1 or 2): ");
		cnfg = in.nextInt();
		Configrations c = new Configrations();
		c.setConfg(cnfg);
		c.getconfg();
		System.out.println("u entered: "+c.getconfg());
	}

}
