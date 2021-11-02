package zadaca08;

public class Vraboten extends Covek{
    private String ime;
    private String prezime;
    private int bod;
    private int vbod;
    
    public Vraboten(String ime,String prezime,int bod, int vbod) {
    	this.ime=ime;
    	this.prezime=prezime;
    	this.bod=bod;
    	this.vbod=vbod;
    }
    public String getIme() {
    	return ime;
    }
    public String getPrezime() {
    	return prezime;
    }
    public int getBod() {
    	return bod;
    }
    public int getVbod() {
    	return vbod;
    }
    @Override
    public int plata() {
    	int p;
    	p=bod*vbod;
    	return p;
    }
}
