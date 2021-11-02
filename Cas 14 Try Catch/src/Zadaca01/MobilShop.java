package Zadaca01;

import java.util.ArrayList;

public class MobilShop {
	 private ArrayList<Mobilen> lagerlista=new ArrayList<Mobilen>();
	    public MobilShop(ArrayList<Mobilen> lista) {
	    	for(int i=0;i<lista.size();i++) {
	    		this.lagerlista.add(lista.get(i));
	    	}	    	
        }
}