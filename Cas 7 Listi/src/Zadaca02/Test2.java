package Zadaca02;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
    	ArrayList<String> iminja=new ArrayList<String>();
    	iminja.add("Ana");
    	iminja.add("Bojana");
    	iminja.add("Vesna");
    	
    	System.out.println("Iminjata se: "+iminja);
    	iminja.add(0, "Biljana");
    	System.out.println("Ime koe e vtoro vo listata: "+iminja.get(1));
    	System.out.println("Pechatenje so for ciklus: ");
    	for(int i=0; i<iminja.size(); i++) {
    		System.out.println(iminja.get(i));
    	}
    }
}
