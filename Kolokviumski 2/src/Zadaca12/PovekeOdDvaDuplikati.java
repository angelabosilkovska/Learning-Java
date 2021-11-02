package Zadaca12;

import java.util.ArrayList;

public class PovekeOdDvaDuplikati implements IProverka{
	
    ArrayList<Integer> lista=new ArrayList<Integer>();
    public PovekeOdDvaDuplikati(ArrayList<Integer> lista) {
    	for(int i=0;i<lista.size();i++) {
    		this.lista.add(lista.get(i));
    	}
    }
    @Override
    public void proveri() {
    	int brojac=0,k=0;
    	for(int i=0;i<lista.size()-1;i++) {
    		brojac=0;
    		for(int j=i+1;j<lista.size();j++)
    			if(lista.get(i)==lista.get(j))
    				brojac ++;
    		    if(brojac!=0) {
    		    	k++;
    		    	System.out.println(lista.get(i)+"se povtoruva"+brojac);
    		    }
    	}
    	if(k==0)
    		System.out.println("Nema povtoruvanje");
    }
}
