package Zadaca09;

public class Dekan {
   private String ime;
   private String prezime;
   private String titula;
   private String fakultet;
   private int plata;
   
   public Dekan() {
	   ime=" ";
	   prezime=" ";
	   fakultet=" ";
	   titula=" ";
	   plata=0;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public String getFakultet() {
	   return fakultet;
   }
   public String getTitula() {
	   return titula;
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
   public void setTitula(String titula) {
	   this.titula=titula;
   }
   public void setFakultet(String fakultet) {
	   this.fakultet=fakultet;
   }
   public void setPlata(int plata) {
	   this.plata=plata;
   }
   
}
