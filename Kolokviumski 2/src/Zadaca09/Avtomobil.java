package Zadaca09;

public class Avtomobil {
   private String marka;
   private String model;
   private int cena;
   
   public Avtomobil(String marka, String model, int cena) {
	   this.marka=marka;
	   this.model=model;
	   this.cena=cena;
   }
   public String getMarka() {
	   return marka;
   }
   public String getModel() {
	   return model;
   }
   public int getCena() {
	   return cena;
   }
}
