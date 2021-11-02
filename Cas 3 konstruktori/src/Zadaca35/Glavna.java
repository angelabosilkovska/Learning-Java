package Zadaca35;

public class Glavna {
   public static void main(String[] args) {
	   Vraboten v=new Vraboten();
	   v.setIme("Angela");
	   v.setPrezime("Bosilkovska");
	   v.setFirma("dajsd");
	   v.setGrad("Bitola");
	   v.setBod(53);
	   v.setVrednostNaBod(675);
	   int pp=v.plata();
	   System.out.println(v.getIme()+" "+v.getPrezime()+" "+v.getFirma()+" "+v.getGrad()+" "+v.getBod()+" "+v.getVrednostNaBod());
	   System.out.println(pp);
   }
   
   
}
