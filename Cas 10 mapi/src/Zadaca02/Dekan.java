 package Zadaca02;

public class Dekan {
   private String ime;
   private String prezime;
   private String fakultet;
   private String titula;
   private int plata;
   
   public Dekan(String ime, String prezime, String fakultet, String titula, int plata) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.fakultet=fakultet;
	   this.titula=titula;
	   this.plata=plata;
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
}
