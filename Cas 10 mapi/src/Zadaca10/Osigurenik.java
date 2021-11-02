package Zadaca10;

public class Osigurenik {
	private String ime;
	   private String prezime;
	   private String firma;
	   private int suma;
	   
	   public Osigurenik() {
		   ime=" ";
		   prezime=" ";
		   firma=" ";
		   suma=0;
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
	   public int getSuma() {
		   return suma;
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
	   public void setSuma(int suma) {
		   this.suma=suma;
	   }
}
