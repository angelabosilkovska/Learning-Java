package Zadaca07;

import java.util.TreeMap;

public class Glavna {

	public static void main(String[] args) {
		TreeMap<Integer, String> poeni=new TreeMap<Integer, String>();
        poeni.put(5, "<51");
        poeni.put(6, "51-60");
        poeni.put(7, "61-70");
        poeni.put(8, "71-80");
        poeni.put(9, "81-90");
        poeni.put(10, "91-100");
        //Pecatenje na prviot i posledniot kluch:
        System.out.println("Prv kluc:"+poeni.firstKey());
        System.out.println("Posleden kluc:"+poeni.lastKey());
        //Pecatenje na prvata i poslednata vrednost
        System.out.println("Prva vrednost:"+poeni.get(poeni.firstKey()));
        System.out.println("Posledna vrednost:"+poeni.get(poeni.lastKey()));
	}

}
