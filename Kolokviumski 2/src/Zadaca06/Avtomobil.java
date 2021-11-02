package Zadaca06;

public class Avtomobil {
   public String marka;
   public String model;
   public int cena;
   
   public Avtomobil(String marka, String model, int cena) {
	   this.marka=marka;
	   this.model=model;
	   this.cena=cena;
   }
   public int ZgolemiCena(int zgolemuvanjeNaCenata) {
	  System.out.println(cena);
	  int x=cena+zgolemuvanjeNaCenata;
	  return x;
   }
}
