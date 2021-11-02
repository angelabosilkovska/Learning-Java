package Zadaca02;

import java.util.ArrayList;
import java.util.Collections;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Integer> celibroevi=new ArrayList<Integer>();
		celibroevi.add(10);
		celibroevi.add(5);
		celibroevi.add(23);
		celibroevi.add(6);
		celibroevi.add(12);
        
		Collections.sort(celibroevi);
		celibroevi.remove(2);
		celibroevi.add(2, 22);
		int[] niza=new int[celibroevi.size()];
		for(int i=0; i<niza.length; i++) {
			niza[i]=celibroevi.get(i).intValue();
		}
		for(int i=0; i<celibroevi.size();i++) {
			System.out.println(niza[i]);
		} 
	}
}
