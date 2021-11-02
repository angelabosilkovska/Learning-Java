package Zadaca2;

public class Vozilo {
   private String marka;
   private String model;
   private String boja;
   private String cena;
   
   public Vozilo() {
	   marka="BMW";
	   model="X6";
	   boja="Crna";
	   cena="50.000";	   
   }
public void pecati() {
	System.out.println(marka+" "+model+" "+boja+" "+cena);
}
}
