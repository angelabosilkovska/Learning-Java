package Zadaca04;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Glavna {

	public static void main(String[] args) {
		Map<Integer, String> mapa1=new HashMap<Integer, String>();
		mapa1.put(1, "eden");
		mapa1.put(2, "dva");
		mapa1.put(3, "tri");
		System.out.println(mapa1);
	
	
	Iterator iter= mapa1.entrySet().iterator();
	
	while (iter.hasNext()) {
		Map.Entry mEntry=(Map.Entry) iter.next();
		System.out.println(mEntry.getKey()+" : "+mEntry.getValue());
	}
}
}