package Zadaca13;

public class Student {
   private String ime;
   private String prezime;
   private int indeks;
   private double prosek;
   
   public Student(String ime, String prezime, int indeks, double prosek) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.indeks=indeks;
	   this.prosek=prosek;
   }
   public String getIme() {
	   return ime;
   }
   public String getPrezime() {
	   return prezime;
   }
   public int getIndeks() {
	   return indeks;
   }
   public double getProsek() {
	   return prosek;
   }
   public void setIme(String ime) {
	   this.ime=ime;
   }
   public void setPrezime(String prezime) {
	   this.prezime=prezime;
   }
   public void setIndeks(int  indeks) {
	   this.indeks=indeks;
   }
   public void setProsek(double prosek) {
	   this.prosek=prosek;
   }
} 
