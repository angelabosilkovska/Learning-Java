package Zadaca37;

public class Glavna {
	 public static void main(String[] args) {
	       Lice l=new Lice();
	  	   l.setIme("Angela");
	  	   l.setPrezime("Bosilkovska");
	  	   l.setVisina(161);
	  	   l.setTezina(50);
	       System.out.println(l.getIme()+" "+l.getPrezime()+" "+l.getVisina()+" "+l.getTezina());
	       
	       Vraboten v=new Vraboten();
	  	   v.setIme("Angela");
	  	   v.setPrezime("Bosilkovska");
	  	   v.setVisina(161);
	  	   v.setTezina(50);
	  	   v.setFirma("dhcjaj");
	  	   v.setPlata(4321);
	       System.out.println(v.getIme()+" "+v.getPrezime()+" "+v.getVisina()+" "+v.getTezina()+" "+v.getFirma()+" "+v.getPlata());
	       
    }
}