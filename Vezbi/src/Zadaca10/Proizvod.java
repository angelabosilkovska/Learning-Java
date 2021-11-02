package Zadaca10;

public class Proizvod {
    private String ime;
    private int cena;
    private String proizvoditel;
    private double tezina;
    
    public Proizvod() {
    	ime="tetratka";
    	cena=30;
    	proizvoditel="fgddg";
    	tezina=5.0;
    }
    public String getIme() {
		return ime;
	}
	public int getCena() {
		return cena;
	}
	public String getProizvoditel() {
		return proizvoditel;
	}
	public double getTezina() {
		return tezina;
	}
	public void setIme(String ime) {
		this.ime=ime;
	}
	public void setCena(int cena) {
		this.cena=cena;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel=proizvoditel;
	}
	public void setTezina(double tezina) {
		this.tezina=tezina;
	}
}
