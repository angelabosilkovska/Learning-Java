package zadaca03;

public class Vozilo {
   public String marka;
   public String model;
   public String boja;
   
   public Vozilo(String marka, String model, String boja) {
	   this.marka=marka;
	   this.model=model;
	   this.boja=boja;
   }
   public String toString() {
	   return marka+model+boja;
   }
}
