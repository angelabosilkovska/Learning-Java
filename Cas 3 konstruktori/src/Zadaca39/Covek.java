package Zadaca39;

public class Covek {
    //privatni atributi na klasata
	 private String ime;
	 private String prezime;
	 private double visina ;
	 private double tezina;
	 private String data;
	 
	 public Covek() {
		   ime=" ";
		   prezime=" ";
		   visina=0;
		   tezina=0;
		   data=" ";
	 }
	 
	 public void setIme(String ime) {
		   this.ime=ime;
	   }
	  public void setPrezime(String prezime) {
		   this.prezime=prezime;
	   }
	   public void setVisina(double visina) {
		   this.visina=visina;
	   }
	   public void setTezina(double tezina) {
		   this.tezina=tezina;
}
	   public void setData(String data) {
		   this.data=data;
	   }
	   public String getIme() {
		   return ime;
	   }
	   
	   public String getPrezime() {
		   return prezime;
	   }
	   public double getVisina() {
		   return visina;
	   }
	   
	   public double getTezina() {
		   return tezina;
	   }	
	   public String getData() {
		   return data;
	   }
	
}
