package Zadaca02;

public class Dekan {
   private String ime;
   private String prezime;
   private String fakultet;
   
   public Dekan(String ime, String prezime, String fakultet) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.fakultet=fakultet;
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
   public void setIme() {
	   this.ime=ime;
   }
   public void setPrezime() {
	   this.prezime=prezime;
   }
   public void setFakultet() {
	   this.fakultet=fakultet;
   }
}
