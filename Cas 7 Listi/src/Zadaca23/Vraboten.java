package Zadaca23;

public class Vraboten {
	private String ime;
	private String prezime;
	private String firma;
	private int plata;
	
	 public Vraboten() {
		   ime=" ";
		   prezime=" ";
		   firma=" ";
		   plata=0;
	   }
	   public String getIme() {
		   return ime;
	   }
	   public String getPrezime() {
		   return prezime;
	   }
	   public String getFirma() {
		   return firma;
	   }
	   public int getPlata() {
		   return plata;
	   }
	   public void setIme(String ime) {
		   this.ime=ime;
	   }
	   public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setFirma(String firma) {
		   this.firma=firma;
	   }
	   public void setPlata(int plata) {
		   this.plata=plata;
	   }
}
