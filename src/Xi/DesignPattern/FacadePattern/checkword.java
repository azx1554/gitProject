package Xi.DesignPattern.FacadePattern;

//子系统
public class checkword {
	String advertisement;
	int amount;
	
	public checkword(String string) {
		advertisement=string;
	}
	
	public void getchargeamount(){
		amount=advertisement.length();
	}
	
	public int getamount(){
		return amount;
	}
}
