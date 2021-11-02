package Zadaca22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Recanik {
	Map<String,String> recnik=new HashMap<String, String>();
	
    public Recanik() {
    	recnik.put("Zdravo", "Hi");
    	recnik.put("Jas", "I");
    	recnik.put("sum", "am");
    }
    public void pecatiValues() {
    	Iterator itr=recnik.entrySet().iterator();
    	while(itr.hasNext()) {
    		Map.Entry element=(Map.Entry) itr.next();
    		System.out.println(element.getValue());
    	}
    }
    public void proveri() {
    	Iterator itr=recnik.entrySet().iterator();
    	while(itr.hasNext()) {
    		Map.Entry element=(Map.Entry) itr.next();
            if(element.getKey().equals("Bicycle")) {  
            	System.out.println("Tocak");
            }
            else
            	System.out.println("Ne postoi takov zbor");
    }
    }
}
