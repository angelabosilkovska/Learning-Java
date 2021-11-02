package Zadaca07;

public class Vraboten extends Covek{
	private String firma;
	private String otcek;
	private String stazz;
	private int plata;
	
	public Vraboten() {
		super();
		firma=" ";
		otcek=" ";
		stazz=" ";
		plata=0;
	}
	 public String getFirma() {
		   return firma;
	   }
	 public String getOtcek() {
		 return otcek;
	 }
	 public String getStazz() {
		   return stazz;
	   }
	 public int getPlata() {
		   return plata;
	   }
	 public void setFirma(String firma) {
		   this.firma=firma;
	   }
	 public void setOtcek(String otcek) {
		 this.otcek=otcek;
	 }
	 public void setStazz(String stazz) {
		   this.stazz=stazz;
	   }
	 public void setPlata(int plata) {
		   this.plata=plata;
	   }
}
