package Zadaca05;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> iminja=new ArrayList<String>();
		iminja.add("Angela");
        iminja.add("Martina");
        iminja.add("Simona");
        System.out.println("Pecatenje na listata: "+iminja);
        iminja.add(0, "Martin");
        System.out.println(iminja.get(1));
        for(int i=0; i<iminja.size(); i++) {
 		   System.out.println(iminja.get(i));
 	   }
	}

}
