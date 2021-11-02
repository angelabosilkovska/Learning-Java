package Zadaca06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer, String> mapa2=new HashMap<Integer, String>();
		mapa2.put(1, "Ponedelnik");
		mapa2.put(2, "Vtornik");
		mapa2.put(3, "Sreda");
		mapa2.put(4, "Cetvrtok");
		mapa2.put(5, "Petok");
        Iterator itr=mapa2.entrySet().iterator();
        while (itr.hasNext()) {
        	Map.Entry element=(Map.Entry) itr.next();
        	System.out.println("Kluc: "+element.getKey()+"-Vrednost:"+element.getValue());
        }
	}

}
