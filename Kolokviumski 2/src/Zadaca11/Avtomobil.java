package Zadaca11;

public class Avtomobil extends PrevoznoSredstvo{
    private double brojNaVrati;
    
    public Avtomobil(String marka, String model, double cena, double brojNaVrati) {
    	super(marka,model,cena);
    	this.brojNaVrati=brojNaVrati;
    }
    public double getBrojNaVrati() {
    	return brojNaVrati;
    }
    public void detali() {
    	System.out.println("Avtomobilot"+" "+getMarka()+"-"+getModel()+" cini "+(int)getCena()+" i ima "+brojNaVrati+".");
    }
}
