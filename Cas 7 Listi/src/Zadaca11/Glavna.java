package Zadaca11;

import java.util.ArrayList;
import java.util.Collections;

public class Glavna {
	public static void main(String[] args) {
		ArrayList<Integer> celibroevi=new ArrayList<Integer>();
		celibroevi.add(34);
		celibroevi.add(65);
		celibroevi.add(35);
		celibroevi.add(78);
		celibroevi.add(67);
        
		Collections.sort(celibroevi);
		System.out.println(celibroevi);
		for (int i=0; i<celibroevi.size(); i++) {
			System.out.println(celibroevi.get(i));
		}
	}
}
