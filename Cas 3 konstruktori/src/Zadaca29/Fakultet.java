package Zadaca29;

public class Fakultet {
    private String ime;
    private String ulica;
    private int tel;
    private int brvraboteni;
    
    public Fakultet(String ime, String ulica, int tel, int brvraboteni) {
    	this.ime=ime;
    	this.ulica=ulica;
    	this.tel=tel;
    	this.brvraboteni=brvraboteni;
    }
    public void pecati() {
    	System.out.println(ime+" "+ulica+" "+tel+" "+brvraboteni);
    }
    public void setIme(String ime) {
    	this.ime=ime;
    }
    public void setUlica(String ulica) {
    	this.ulica=ulica;
    }
    public void setTel(int tel) {
    	this.tel=tel;
    }
    public void setBrvraboteni(int brvraboteni) {
    	this.brvraboteni=brvraboteni;
    }
}
