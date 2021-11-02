package Zadaca26;

public class Velosiped extends PrevoznoSredstvo{
   private boolean imaKoshnica;
   
   public Velosiped(String marka, String model, double cena, boolean imaKoshnica) {
	   super(marka,model,cena);
	   this.imaKoshnica=imaKoshnica;
   }
   public void detail() {
	   if(imaKoshnica==true) {
		   System.out.println("Velosipedot "+getMarka()+" - "+getModel()+" cini "+(int)getCena()+" i ima koshnica.");
	   }
	   if(imaKoshnica==false) {
		   System.out.println("Velosipedot "+getMarka()+" - "+getModel()+" cini "+(int)getCena());
	   }
   }
}
