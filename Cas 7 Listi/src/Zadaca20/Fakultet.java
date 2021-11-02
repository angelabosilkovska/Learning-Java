package Zadaca20;

public class Fakultet {
    private String imenafakultet;
    private int brojnasmerovi;
    private int vkupnostudenti;
    
    public Fakultet(String imenafakultet, int brojnasmerovi, int vkupnostudenti) {
    	this.imenafakultet=imenafakultet;
    	this.brojnasmerovi=brojnasmerovi;
    	this.vkupnostudenti=vkupnostudenti;
    }
    public String getImenafakultet() {
    	return imenafakultet;
    }
    public int getBrojnasmerovi() {
    	return brojnasmerovi;
    }
    public int getVkupnostudenti() {
    	return vkupnostudenti;
    }
}
