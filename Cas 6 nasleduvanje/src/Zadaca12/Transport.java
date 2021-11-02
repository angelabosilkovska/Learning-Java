package Zadaca12;

public abstract class Transport {
   private double tezinaNaTovar;
   private int dolzinaVoKm;
   
   public Transport(double tezinaNaTovar, int dolzinaVoKm) {
	   this.tezinaNaTovar=tezinaNaTovar;
	   this.dolzinaVoKm=dolzinaVoKm;
   }
   public double getTezinaNaTovar() {
	   return tezinaNaTovar;
   }
   public int getDolzinaVoKm() {
	   return dolzinaVoKm;
   }
   public abstract double presmetka();
}
