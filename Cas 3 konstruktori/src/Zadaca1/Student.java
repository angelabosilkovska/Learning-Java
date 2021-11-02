package Zadaca1;

public class Student {
	 //1. del od sekoja klasa
	   //polinja na podatoci klasata
	   //atributi na klasata
	   private String ime;
	   private String prezime;
	   private int indeks;
	   private double prosek;
	   
	   //2. del od klasata
	   //Konstruktor
	   //Konstruktorot e poseen tip na metoda koja
	   //1. SEKOJA E JAVEN
	   //2. NEMA TIP MNOGU VZNO
	   //3. Sekogas nosi istoto ime i imeto na klasata
	   //4. NE PRIMA VLEZNI PARAMETRI - ZAVISI OD TIPOT NA KONSTRUKTOR
	   //1 2 3 4 
	   public Student() {
		   //KONSTRUKTOROT SLUZI ZA KREIRANJE NA OBJEKTI I PRISTAP DO PRIVATNITE ATRIBUTI
		   // dodeluvanje na vrednosti n atributute
		   ime="Petko";
		   prezime="Prezime";
		   indeks=61;
		   prosek=9.5;
		   System.out.println("Zdravo");
	   }
//dopolnitelna netoda za pecatenje na podatocite na
public void pecati() {
	System.out.println("Studentot "+ime+" "+prezime+" ima indeks "+indeks+" so prosek "+prosek);
}
}
