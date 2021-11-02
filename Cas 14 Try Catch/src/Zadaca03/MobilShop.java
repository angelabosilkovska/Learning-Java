package Zadaca03;

import java.util.ArrayList;

public class MobilShop {
	 private ArrayList<Mobilen> lagerlista=new ArrayList<Mobilen>();
	   
	 public MobilShop(ArrayList<Mobilen> lista) throws ZeroLagerQuantityException {
			for(int i=0;i<lista.size();i++) {
				 if(lista.get(i).getLagerLista()==0)
					 throw new ZeroLagerQuantityException("Prikaz greska ");
				 else
					 lagerlista.add(lista.get(i));
	    	}	    	
     }
	 public void funkcija(int n) throws ZeroLagerQuantityException{
		  	   for(int i=0;i<n;i++) {
		  	   System.out.println(lagerlista.size()+"  .  ");
			   
		  	   try {
			   lagerlista.remove(lagerlista.get(i));
			   }
		   
			   catch(Exception e){
			   throw new ZeroLagerQuantityException("Greska");
		   }
     }
}
}