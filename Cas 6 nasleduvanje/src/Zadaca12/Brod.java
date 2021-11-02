package Zadaca12;

public class Brod extends Transport{
    private double potrosuvackaNaNafta;
    private double cenaNaNafta;
    private double cenaNaStruja;
    
    public Brod(double tezinaNaTovar, int dolzinaVoKm, double potrosuvackaNaNafta, double cenaNaNafta, double cenaNaStruja) {
    	super(tezinaNaTovar,dolzinaVoKm);
    	this.potrosuvackaNaNafta=potrosuvackaNaNafta;
    	this.cenaNaNafta=cenaNaNafta;
    	this.cenaNaStruja=cenaNaStruja;
    }
    public double getPotrosuvackaNaNafta() {
    	return potrosuvackaNaNafta;
    }
    public double getCenaNaNafta() {
    	return cenaNaNafta;
    }
    public double getCenaNaStruja() {
    	return cenaNaStruja;
    }
    @Override
    public double presmetka() {
         double bb;
         bb=getPotrosuvackaNaNafta()/100*getCenaNaNafta();
         return bb;
    }
    
   
}
