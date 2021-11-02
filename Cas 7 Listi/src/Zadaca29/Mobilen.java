package Zadaca29;

public class Mobilen {
   public String marka;
   public String model;
   private int cena;
   
   public Mobilen(String marka, String model, int cena) {
	   this.marka=marka;
	   this.model=model;
	   this.cena=cena;
   }
   public int getCena() {
	   return cena;
   }
}
