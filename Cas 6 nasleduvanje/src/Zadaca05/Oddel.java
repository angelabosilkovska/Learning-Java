package Zadaca05;

public class Oddel extends Firma {
    private int godinaOtvoranjeO;
    private int brojVraboteniO;
    
    public Oddel(String imeF, String ulicaF, int telefonF, int godinaOtvoranjeO, int brojVraboteniO) {
    	super(imeF,ulicaF,telefonF);
    	this.godinaOtvoranjeO=godinaOtvoranjeO;
    	this.brojVraboteniO=brojVraboteniO;
    }
    public int getGodinaOtvoranjeO() {
 	   return godinaOtvoranjeO;
    }
    public int getBrojVraboteniO() {
 	   return brojVraboteniO;
    }
    public void setGodinaOtvoranjeO(int godOtvoranjeO) {
    	this.godinaOtvoranjeO=godinaOtvoranjeO;
    }
    public void setBrojVraboteniO(int brojVraboteniO) {
    	this.brojVraboteniO=brojVraboteniO;
    }
}
