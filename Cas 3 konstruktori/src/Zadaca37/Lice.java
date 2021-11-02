package Zadaca37;

public class Lice {
	 private String ime;
	 private String prezime;
	 private int visina ;
	 private int tezina;
	 
	 public Lice() {
		   ime=" ";
		   prezime=" ";
		   visina=0;
		   tezina=0;
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
}