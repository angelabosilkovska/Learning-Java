package Zadaca05;

public class Firma {
   private String imeF;
   private String ulicaF;
   private int telefonF;
   
   public Firma(String imeF, String ulicaF, int telefonF) {
	   this.imeF=imeF;
	   this.ulicaF=ulicaF;
	   this.telefonF=telefonF;
   }
   public String getImeF() {
	   return imeF;
   }
   public String getUlicaF() {
	   return ulicaF;
   }
   public int getTelefonF() {
	   return telefonF;
   }
   public void setImeF(String imeF) {
	   this.imeF=imeF;
   }
   public void setUlicaF(String ulicaF) {
	   this.ulicaF=ulicaF;
   }
   public void setTelefonF(int telefonF) {
	   this.telefonF=telefonF;
   }
}
