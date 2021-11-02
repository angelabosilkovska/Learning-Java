package Zadaca02;

public class Mobilen {
   public String marka;
   public String model;
   private int lagerlista;
   private int cena;
   
   public Mobilen(String marka, String model, int lagerlista, int cena) {
	   this.marka=marka;
	   this.model=model;
	   this.lagerlista=lagerlista;
	   this.cena=cena;
   }
   public int getLagerLista() {
	   return lagerlista;
   }
   public int getCena() {
	   return cena;
   }
}
