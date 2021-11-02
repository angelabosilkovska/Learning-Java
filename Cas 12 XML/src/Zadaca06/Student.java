package Zadaca06;

public class Student {
   private String ime;
   private String prezime;
   private String indeks;
   private String prosek;
   
   public Student(String ime, String prezime, String indeks, String prosek) {
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
   public String getIndeks() {
	   return indeks;
   }
   public String getProsek() {
	   return prosek;
   }
}
