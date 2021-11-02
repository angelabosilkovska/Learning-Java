package Zadaca09;

public class Vraboten extends Covek{
    private int osnovnaPlata;
    
    public Vraboten(String ime, String prezime, int godini, int osnovnaPlata) {
    	super(ime,prezime,godini);
    	this.osnovnaPlata=osnovnaPlata;
    }
    public int getOsnovnaPlata() {
	    return osnovnaPlata;
    }
    public int Presmetaj() {
    	int x;
    	x=osnovnaPlata*getGodini()-18;
    	return x;
    }
}
