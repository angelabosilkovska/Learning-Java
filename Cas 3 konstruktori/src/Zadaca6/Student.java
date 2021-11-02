package Zadaca6;

public class Student {
   private String ime;
   private String prezime;
   private int indeks;
   
   //vtor tip na konstruktur
   public Student (String ime, String prezime, int indeks) {
	   this.ime=ime;
	   this.prezime=prezime;
	   this.indeks=indeks;
   }
public void pecati() {
	System.out.println(ime+" "+prezime+" "+indeks);
}
}
