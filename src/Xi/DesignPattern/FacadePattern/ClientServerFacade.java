package Xi.DesignPattern.FacadePattern;

//外观(Facade)
public class ClientServerFacade {
	private checkword word;
	private charge cost;
	private TypeSetting typesetting;
	
	ClientServerFacade(String string){
		word=new checkword(string);
		cost=new charge(word);
		typesetting=new TypeSetting(string);
	}
	
	public void doadvertisement(){
		word.getchargeamount();
		cost.givecharge();
		typesetting.typesetting();
	}

}
