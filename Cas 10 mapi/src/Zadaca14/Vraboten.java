package Zadaca14;

public class Vraboten {
   private String ime;
   private String prezime;
   private int plata;
   
   public Vraboten(String ime, String prezime, int plata) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.plata=plata;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public int getPlata() {
	   return plata;
   }
}
