package Zadaca02;

import java.util.ArrayList;

public class MobilShop{
	 private ArrayList<Mobilen> lagerlista=new ArrayList<Mobilen>();
	   
	 public MobilShop(ArrayList<Mobilen> lista) throws ZeroLagerQuantityException {
			for(int i=0;i<lista.size();i++) {
				 if(lista.get(i).getLagerLista()==0)
					 throw new ZeroLagerQuantityException("Prikaz greska ");
				 else
					 lagerlista.add(lista.get(i));
	    	}	    	
     }
}
