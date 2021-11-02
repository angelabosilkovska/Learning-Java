package Zadaca37;

public class Vraboten {
	 private String ime;
	 private String prezime;
	 private int visina ;
	 private int tezina;
	 private String firma;
	 private int plata;
	 
	 public Vraboten() {
		   ime=" ";
		   prezime=" ";
		   visina=0;
		   tezina=0;
		   firma=" ";
		   plata=0;
	 }
	 
	  public void setIme(String ime) {
		   this.ime=ime;
	   }
	  public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setVisina(int visina) {
		   this.visina=visina;
	   }
	   public void setTezina(int tezina) {
		   this.tezina=tezina;
}
	   public void setFirma(String firma) {
		   this.firma=firma;
	   }
	   public void setPlata(int plata) {
		   this.plata=plata;
	   }
	   public String getIme() {
		   return ime;
	   }
	   
	   public String getPrezime() {
		   return prezime;
	   }
	   public int getVisina() {
		   return visina;
	   }
	   
	   public int getTezina() {
		   return tezina;
	   }	
	   public String getFirma() {
		   return firma;
	   }
	   public int getPlata() {
		   return plata;
	   }
	   
}
