package Zadaca02;

public class Vraboten {
    public String ime;
    public String prezime;
    public int embg;
    
    public Vraboten() {
    	ime=" ";
    	prezime=" ";
    	embg=0;
    }
    public String getIme() {
    	return ime;
    }
    public String getPrezime() {
    	return prezime;
    }
    public int getEmbg() {
    	return embg;
    }
    public void setIme(String ime) {
    	this.ime=ime;
    }
    public void setPrezime(String prezime) {
    	this.prezime=prezime;
    }
    public void setEmbg(int embg) {
    	this.embg=embg;
    }
}
