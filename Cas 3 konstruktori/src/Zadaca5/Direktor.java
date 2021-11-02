package Zadaca5;

public class Direktor {
   private String ime;
   private String prezime;
   private int telefon;
   private String uciliste;
   private int plata;
   
   public Direktor() {
	   ime="Hristijan";
	   prezime="Petrovski";
	   telefon=554;
	   uciliste="Kliment Ohridski";
	   plata=1000;
   }
   public void pecati() {
		System.out.println(ime+prezime+telefon+uciliste+plata);
}
}