package Zadaca38;

public class Glavna {
	public static void main(String[] args) {
	       Lice l=new Lice();
	  	   l.setIme("Angela");
	  	   l.setPrezime("Bosilkovska");
	  	   l.setVisina(161);
	  	   l.setTezina(50);
	       System.out.println(l.getIme()+" "+l.getPrezime()+" "+l.getVisina()+" "+l.getTezina());
	       
	       Profesor p=new Profesor();
	  	   p.setIme("Angela");
	  	   p.setPrezime("Bosilkovska");
	  	   p.setVisina(161);
	  	   p.setTezina(50);
	  	   p.setPlata(4321);
	       System.out.println(p.getIme()+" "+p.getPrezime()+" "+p.getVisina()+" "+p.getTezina()+" "+p.getPlata());
 }
}
