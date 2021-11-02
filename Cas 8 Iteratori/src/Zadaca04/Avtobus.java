package Zadaca04;

public class Avtobus {
	private String marka;
	private String model;
	private int brNaPatnici;
	private int godina;
	   
	   public Avtobus(String marka, String model, int brNaPatnici, int godina) {
		   this.marka=marka;
		   this.model=model;
		   this.brNaPatnici=brNaPatnici;
		   this.godina=godina;
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
