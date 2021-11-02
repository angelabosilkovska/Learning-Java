package Zadaca7;

public class Avtous {
	private String marka;
	private String model;
	private int brnapatnici;
	private int godina;
	
	public Avtous (String marka, String model, int brnapatnici, int godina) {
		this.marka=marka;
		this.model=model;
		this.brnapatnici=brnapatnici;
		this.godina=godina;
	}		
public void pecati() {
	System.out.println(marka+" "+model+" "+brnapatnici+" "+godina);
}
}
