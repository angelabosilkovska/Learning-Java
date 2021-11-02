package Zadaca23;

public class Kompjuter {
	    private String tipnaprocesor;
	    private String goleminanadisk;
	    private int goleminanaram;
	    public Kompjuter(String tipnaprocesor, String goleminanadisk, int goleminanaram) {
	    	this.goleminanadisk=goleminanadisk;
	    	this.tipnaprocesor=tipnaprocesor;
	    	this.goleminanaram=goleminanaram;
	    }
	    public String getgoleminanadisk() {
	    	return goleminanadisk;
	    }
	    public String gettipnaprocesor() {
	        return tipnaprocesor;
	    }
	    public double getgoleminanaram() {
	    	return goleminanaram;
	    }
	    
}
