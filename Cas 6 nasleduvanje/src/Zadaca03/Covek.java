package Zadaca03;

public class Covek {
	 private String ime;
	 private String prezime;
	 private double visina;
	 private double tezina;
	   
	   public Covek(String ime, String prezime, double visina, double tezina) {
		   this.ime=ime;
		   this.prezime=prezime;
		   this.visina=visina;
		   this.tezina=tezina;
	   }
	   public String getIme() {
		   return ime;
	   }
	   public String getPrezime() {
		   return prezime;
	   }
	   public double getVisina() {
		   return visina;
	   }
	   public double getTezina() {
		   return tezina;
	   }
	   public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setVisina(double visina) {
		   this.visina=visina;
	   }
	   public void setTezina(double tezina) {
		   this.tezina=tezina;
	   }
}
