package Zadaca07;

public class Vozilo {
    private String marka;
    private String model;
    private String boja;
    private String cena;
    
    public Vozilo(String marka, String model, String boja, String cena) {
    	this.model=model;
    	this.marka=marka;
    	this.boja=boja;
    	this.cena=cena;
    }
    public String getMarka(){
    	return marka;
    	}
    public String getModel() {
    	return model;
    }
    public String getBoja() {
    	return boja;
    }
    public String getCena() {
    	return cena;
    }
}
