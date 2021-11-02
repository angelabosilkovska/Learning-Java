package Zadaca26;

public abstract class PrevoznoSredstvo {
    private String marka;
    private String model;
    private double cena;
    
    public PrevoznoSredstvo(String marka, String model, double cena) {
    	this.marka=marka;
    	this.model=model;
    	this.cena=cena;
    }
    public abstract void detail();
    
    public String getMarka() {
    	return marka;
    }
    public String getModel() {
    	return model;
    }
    public double getCena() {
    	return cena;
    }
}
