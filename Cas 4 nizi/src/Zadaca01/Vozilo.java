package Zadaca01;

public class Vozilo {
    private String marka;
    private String model;
    private String boja;
    private int cena;
    
    public Vozilo(String marka, String model, String boja, int cena) {
    	this.marka=marka;
    	this.model=model;
    	this.boja=boja;
    	this.cena=cena;
    }
    public Vozilo() {
    	marka=" ";
    	model=" ";
    	boja=" ";
    	cena=0;
    }
    public String getmarka() {
    	return marka;
    }
    public String getmodel() {
    	return model;
    }
    public String getboja() {
    	return boja;
    }
    public int getcena() {
    	return cena;
    }
}
