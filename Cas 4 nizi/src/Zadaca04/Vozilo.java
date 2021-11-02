package Zadaca04;

public class Vozilo {
	   private String marka;
	   private String model;
	   private String boja;
	   private int cena;
	   
	   public Vozilo() {
	   	marka=" ";
	   	model=" ";
	   	boja=" ";
	   	cena=0;
	   }
	   public void setMarka(String marka) {
		   this.marka=marka;
	   }
	   public void setModel(String model) {
		   this.model=model;
	   }
	   public void setBoja(String boja) {
		   this.boja=boja;
	   }
	   public void setCena(int cena) {
		   this.cena=cena;
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
	   
}
