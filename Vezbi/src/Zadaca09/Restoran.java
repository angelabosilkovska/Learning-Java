package Zadaca09;

public class Restoran {
    private String ime;
    private String lokacija;
    private int telefon;
    private int brNaSedista;
    
    public Restoran() {
		ime=" ";
		lokacija=" ";
		telefon=0;
		brNaSedista=0;
	}
	public String getIme() {
		return ime;
	}
	public String getLokacija() {
		return lokacija;
	}
	public int getTelefon() {
		return telefon;
	}
	public int getBrNaSedista() {
		return brNaSedista;
	}
	public void setIme(String ime) {
		this.ime=ime;
	}
	public void setLokacija(String lokacija) {
		this.lokacija=lokacija;
	}
	public void setTelefon(int telefon) {
		this.telefon=telefon;
	}
	public void setBrNaSedista(int brNaSedista) {
		this.brNaSedista=brNaSedista;
	}
}