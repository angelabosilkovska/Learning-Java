package Zadaca31;

public class Servers {
    private String processors;
    private String niclp;
    private String hddSize;
    
    public Servers() {
    	processors=" ";
    	niclp=" ";
    	hddSize=" ";
    }
    public String getprocessors() {
    	return processors;
    }
    public String getniclp() {
    	return niclp;
    }
    public String gethddSize() {
    	return hddSize;
    }
    public void setProcessors(String processors) {
    	this.processors=processors;
    }
    public void setNiclp(String niclp) {
    	this.niclp=niclp;
    }
    public void setHddSize(String hddSizee) {
    	this.hddSize=hddSize;
    }
}
