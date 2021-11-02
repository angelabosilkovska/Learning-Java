package Zadaca11;

public class Avtomobil {
	 public String marka;
	 public String model;
	 public String boja;
	 public int pominatiKm;
	 
	 public Avtomobil(String marka, String model, String boja, int pominatiKm) {
	    	this.marka=marka;
	    	this.model=model;
	    	this.boja=boja;
	    	this.pominatiKm=pominatiKm;
	 }
	 public int Mnozenje(int pomnoziKM) {
		 int x=pominatiKm*pomnoziKM;
		 return x;
	 }
}
