package Zadaca21;

public class Profesor {
   private String ime;
   private String prezime;
   private String ulica;
   private String telefon;
   private int maticenBroj;
   private int plata;
   
   public Profesor(String ime, String prezime, String ulica, String telefon, int maticenBroj, int plata) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.ulica=ulica;
	   this.telefon=telefon;
	   this.maticenBroj=maticenBroj;
	   this.plata=plata;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public String getUlica() {
	   return ulica;
   }
   public String getTelefon() {
	   return telefon;
   }
   public int getMaticenBroj() {
	   return maticenBroj;
   }
   public int getPlata() {
	   return plata;
   }
}
