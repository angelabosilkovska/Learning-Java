package Zadaca12;

public class Vozilo {
    private String marka;
    private String model;
    private String cena;
    
    public Vozilo(String marka, String model, String cena) {
    	this.marka=marka;
    	this.model=model;
    	this.cena=cena;
    }
    public String getMarka() {
    	return marka;
    }
    public String getModel() {
    	return model;
    }
    public String getCena() {
    	return cena;
    }
}
