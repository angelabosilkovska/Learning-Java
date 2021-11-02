package Zadaca27;

public class Profesor {
   private String ime;
   private String prezime;
   private String titula;
   private int plata;
   
   public Profesor(String ime, String prezime, String titula, int plata) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.titula=titula;
	   this.plata=plata;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public String getTitula() {
	   return titula;
   }
   public int getPlata() {
	   return plata;
   }
   public boolean prebaruvanjeIme(String kluc) {
	   if(kluc.equals(ime)) 
		   return true;
	   
	   else
		   return false;
   }
   public boolean prebaruvanjePrezime(String kluc) {
	   if(kluc.equals(prezime)) 
		   return true;
	   
	   else
		   return false;
   }
   public boolean prebaruvanjeTitula(String kluc) {
	   if(kluc.equals(titula)) 
		   return true;
	   
	   else
		   return false;
   }
   public boolean prebaruvanjePlata(int kluc) {
	   if(kluc==plata) 
		   return true;
	   
	   else
		   return false;
   }
}
