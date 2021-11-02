package Zadaca11;

public class Gradovi {
	   private String ime;
	   private String drzava;
	   private int brNaZiteli;
	   
	   public Gradovi() {
		   ime=" ";
		   drzava=" ";
		   brNaZiteli=0;
	   }
	   public String getIme() {
		   return ime;
	   }
	   public String getDrzava() {
		   return drzava;
	   }
	   public int getBrNaZiteli() {
		   return brNaZiteli;
	   }
	   public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setDrzava(String drzava) {
		   this.drzava=drzava;
	   }
	   public void setBrNaZiteli(int brNaZiteli) {
		   this.brNaZiteli=brNaZiteli;
	   }
}
