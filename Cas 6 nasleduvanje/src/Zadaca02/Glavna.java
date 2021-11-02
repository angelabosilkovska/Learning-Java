package Zadaca02;

public class Glavna {
   public static void main(String[] args) {
	   Lice l=new Lice("Petko","Petkovski",180,80);
	   System.out.println(l.getIme()+" "+l.getPrezime()+" "+l.getVisina()+" "+l.getTezina());
	   Vraboten v=new Vraboten("Petko","Petkovski",180,80,"hfsdkf","hdfdsk");
	   System.out.println(l.getIme()+" "+l.getPrezime()+" "+l.getVisina()+" "+l.getTezina()+" "+v.getFirma()+" "+v.getPlata());
	   
   }
}
