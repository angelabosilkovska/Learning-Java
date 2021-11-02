package Zadaca05;

public class Sef extends Oddel{
	private String imeS;
	private String prezimeS;
	private int telefonS;
	private String ulicaS;
	private int bodS;
    private int vbodS;
    
    public Sef(String imeF, String ulicaF, int telefonF, int godinaOtvoranjeO, int brojVraboteniO, String imeS,String prezimeS, int telefonS, String ulicaS, int bodS, int vbodS) {
    	super(imeF,ulicaF,telefonF,godinaOtvoranjeO,brojVraboteniO);
    	this.imeS=imeS;
    	this.prezimeS=prezimeS;
    	this.telefonS=telefonS;
    	this.ulicaS=ulicaS;
    	this.bodS=bodS;
    	this.vbodS=vbodS;
    }
    public String getImeS() {
 	   return imeS;
    }
    public String getPrezimeS() {
    	return prezimeS;
    }
    public String getUlicaS() {
 	   return ulicaS;
    }
    public int getTelefonS() {
 	   return telefonS;
    }
    public int getBodS() {
    	return bodS;
    }
    public int getVbodS(){
    	return vbodS;
    }
    public void setImeS(String imeS) {
 	   this.imeS=imeS;
    }
    public void setPrezimeS(String prezimeS) {
    	this.prezimeS=prezimeS;
    }
    public void setUlicaS(String ulicaS) {
 	   this.ulicaS=ulicaS;
    }
    public void setTelefoonS(int telefonS) {
 	   this.telefonS=telefonS;
    }
    public void setBodS(int bodS) {
    	this.bodS=bodS;
    }
    public void setVbodS(int vbodS) {
    	this.vbodS=vbodS;
    }
}
