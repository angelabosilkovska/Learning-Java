package Zadaca05;

public class Vraboten extends Oddel{
	private String imeV;
	private String prezimeV;
	private int telefonV;
	private String ulicaV;
	private int bodV;
    private int vbodV;
    
    public Vraboten(String imeF, String ulicaF, int telefonF, int godinaOtvoranjeO, int brojVraboteniO, String imeV,String prezimeV, int telefonV, String ulicaV, int bodV, int vbodV) {
    	super(imeF,ulicaF,telefonF,godinaOtvoranjeO,brojVraboteniO);
    	this.imeV=imeV;
    	this.prezimeV=prezimeV;
    	this.telefonV=telefonV;
    	this.ulicaV=ulicaV;
    	this.bodV=bodV;
    	this.vbodV=vbodV;
    }
    public String getImeV() {
 	   return imeV;
    }
    public String getPrezimeV() {
    	return prezimeV;
    }
    public String getUlicaV() {
 	   return ulicaV;
    }
    public int getTelefonV() {
 	   return telefonV;
    }
    public int getBodV() {
    	return bodV;
    }
    public int getVbodV(){
    	return vbodV;
    }
    public void setImeV(String imeV) {
 	   this.imeV=imeV;
    }
    public void setPrezimeV(String prezimeV) {
    	this.prezimeV=prezimeV;
    }
    public void setUlicaV(String ulicaV) {
 	   this.ulicaV=ulicaV;
    }
    public void setTelefoonV(int telefonV) {
 	   this.telefonV=telefonV;
    }
    public void setBodV(int bodV) {
    	this.bodV=bodV;
    }
    public void setVbodV(int vbodV) {
    	this.vbodV=vbodV;
    }
}
