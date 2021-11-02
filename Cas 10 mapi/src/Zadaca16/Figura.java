package Zadaca16;

import java.util.HashMap;
import java.util.Map;

public class Figura {
	private Map<Integer, Kvadar> mapa1=new HashMap<Integer, Kvadar>();
	   
	   public Figura(Map<Integer, Kvadar> mapa1) {
	   	int i=0;
	   	for(Kvadar k:mapa1.values()) {
	   		this.mapa1.put(i+1, k);
	   		i++;
	   	}
	   }
	   	public void pecati() {
	    	for(Kvadar k:this.mapa1.values()) {
	    		System.out.println(k.getA()+" "+k.getB()+" "+k.getC());
	    	}
	    	}
	   	public void Plostina() {
	   		for(Kvadar k:mapa1.values()) {
	   		int x;
	   		x=2*k.getA()*k.getB()+k.getA()*k.getC()+k.getB()*k.getC();
	   		System.out.println(x);
	   	}
	   	}
	   	public void Volumen() {
	   		for(Kvadar k:mapa1.values()) {
	   			int y;
	   			y=k.getA()*k.getB()*k.getC();
	   			System.out.println(y);
	   		}
	   	}
	   	}