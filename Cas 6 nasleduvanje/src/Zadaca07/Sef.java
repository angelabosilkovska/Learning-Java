package Zadaca07;

public class Sef extends Vraboten{
	private int br_rabotnici;
	private int br_proekti;
	
	public Sef() {
		super();
		br_rabotnici=0;
		br_proekti=0;
	}
	public int getBr_rabotinci() {
		   return br_rabotnici;
	   }
	public int getBr_proekti() {
		 return br_proekti;
	 }
	public void setBr_rabotnici(int br_rabotnici) {
		   this.br_rabotnici=br_rabotnici;
	   }
	public void setBr_proekti(int br_proekti) {
		   this.br_proekti=br_proekti;
	   }
}
