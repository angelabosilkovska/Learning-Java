package Zadaca22;

public class Avtomobil {
   private String marka;
   private String model;
   private String boja;
   private int cena;
   private int izminatiKm;
   private int godina;
   
   public Avtomobil(String marka, String model, String boja, int cena, int izminatiKm, int godina) {
	   this.marka=marka;
	   this.model=model;
	   this.boja=boja;
	   this.cena=cena;
	   this.izminatiKm=izminatiKm;
	   this.godina=godina;
   }
   public String getMarka() {
	   return marka;
   }
   public String getModel() {
	   return model;
   }
   public String getBoja() {
	   return boja;
   }
   public int getCena() {
	   return cena;
   }
   public int getIzminatiKm() {
	   return izminatiKm;
   }
   public int getGodina() {
	   return godina;
   }
}
