package Zadaca15;
import java.util.Map;
import java.util.HashMap;

public class Otseci {
   private Map<Integer, Predmet> mapa1=new HashMap<Integer, Predmet>();
   
   public Otseci(Map<Integer, Predmet> mapa1) {
   	int i=0;
   	for(Predmet s:mapa1.values()) {
   		this.mapa1.put(i+1, s);
   		i++;
   	}
   }
   	public void pecati() {
    	for(Predmet s:this.mapa1.values()) {
    		System.out.println(s.getIme()+" "+s.getOtsek()+" "+s.getSemestar()+" "+s.getGodina());
    	}
    	}
   	public void prebarajPoIme(String ime2) {
		int k=0;
		for(Predmet s:this.mapa1.values()) {
			if(s.getIme().equals(ime2)) {
				System.out.println(s.getIme()+" "+s.getOtsek()+" "+s.getSemestar()+" "+s.getGodina());
				k++;
			}
			if(k==0) {
				System.out.println("nema");
			}
		}
    }
   	public void prebarajPoGodina(int godina2) {
		int k=0;
		for(Predmet s:this.mapa1.values()) {
			if(s.getGodina()==godina2) {
				System.out.println(s.getIme()+" "+s.getOtsek()+" "+s.getSemestar()+" "+s.getGodina());
				k++;
			}
			if(k==0) {
				System.out.println("nema");
			}
		}
}}