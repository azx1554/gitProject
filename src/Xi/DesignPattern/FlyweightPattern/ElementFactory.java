package Xi.DesignPattern.FlyweightPattern;

import java.util.HashMap;

//享元工厂与具体享元
public class ElementFactory {
	private HashMap<String, Element> hashmap;
	static ElementFactory Factory=new ElementFactory();
	private ElementFactory(){
		hashmap=new HashMap<String, Element>();
	}
	
	public static ElementFactory getfactory(){
		return Factory;
	}
	
	public synchronized Element getelement(String key){
		if(hashmap.containsKey(key))
			return hashmap.get(key);
		else{
			char elementOne='\0',elementTwo='\0';
			elementOne=key.charAt(0);
			elementTwo=key.charAt(1);
			Element element=new TwoElement(elementOne,elementTwo);
			hashmap.put(key, element);
			return element;
		}
	}
	
	public class TwoElement implements Element{
		private char elementOne,elementTwo;

		//因为构造函数为私有，所以定义为内部类
		private TwoElement(char elementOne,char elementTwo) {
			this.elementOne=elementOne;
			this.elementTwo=elementTwo;
			
		}

		
		public void printMess(String name, int elementOneNumber,int elementTwoNumber) {
			System.out.print(name+"由"+elementOne+"和"+elementTwo+"组成");
			System.out.println("含有"+elementOneNumber+"个"+elementOne+"元素"+"和"+elementTwoNumber+"个"+elementTwo+"元素");
			
		}

	}

}
