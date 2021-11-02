package Zadaca03;

public class Gradovi {
	private String ime;
	private int brNaZitel;
	private String drzava;
	   
	   public Gradovi(String ime, int brNaZitel, String drzava) {
		   this.ime=ime;
		   this.brNaZitel=brNaZitel;
		   this.drzava=drzava;
	   }
	   public String getIme() {
		   return ime;
	   }
	   public int getBrNaZitel() {
		   return brNaZitel;
	   }
	   public String getDrzava() {
		   return drzava;
	   }
	   public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setBrNaZitel(int brNaZitel) {
		   this.brNaZitel=brNaZitel;
	   }
	   public void setDrzava(String drzava) {
		   this.drzava=drzava;
	   }
}
