package Zadaca03;

public class Glavna {
	 public static void main(String[] args) {
		   Covek c=new Covek("Petko","Petkovski",180,80);
		   System.out.println(c.getIme()+" "+c.getPrezime()+" "+c.getVisina()+" "+c.getTezina());
		   Doktor d=new Doktor("Petko","Petkovski",180,80,"hfsdkf",353,"fgsgfd");
		   System.out.println(d.getIme()+" "+d.getPrezime()+" "+d.getVisina()+" "+d.getTezina()+" "+d.getSpecijalizacija()+" "+d.getPlata()+" "+d.getRabmesto());
		   
	   }
}
