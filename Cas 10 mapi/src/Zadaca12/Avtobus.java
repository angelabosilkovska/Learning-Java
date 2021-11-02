package Zadaca12;

public class Avtobus {
	   private String marka;
	   private String model;
	   private int brNaPatnici;
	   private int godina;
	   
	   public Avtobus() {
		   marka=" ";
		   model=" ";
		   brNaPatnici=0;
		   godina=0;
	   }
	   public String getMarka() {
		   return marka;
	   }
	   public String getModel() {
		   return model;
	   }
	   public int getBrNaPatnici() {
		   return brNaPatnici;
	   }
	   public int getGodina() {
		   return godina;
	   }
	   public void setMarka(String marka) {
		   this.marka=marka;
	   }
	   public void setModel(String model) {
		   this.model=model;
	   }
	   public void setBrNaPatnici(int brNaPatnici) {
		   this.brNaPatnici=brNaPatnici;
	   }
	   public void setGodina(int godina) {
		   this.godina=godina;
	   }
}
