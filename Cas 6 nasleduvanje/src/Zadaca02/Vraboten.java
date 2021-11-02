package Zadaca02;

public class Vraboten extends Lice{
   private String firma;
   private String plata;
   
   public Vraboten(String ime, String prezime, double visina, double tezina, String firma, String plata) {
	   super(ime,prezime,visina,tezina);
	   this.firma=firma;
	   this.plata=plata;
   }
   public String getFirma() {
   	return firma;
   }
   public String getPlata() {
   	return plata;
   }
}
