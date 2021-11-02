package Zadaca34;

public class Glavna {
	 public static void main(String[] args) {
		   Kvadar k=new Kvadar();
		   k.seta(3);
		   k.setb(7);
		   k.setc(6);
		   int pp=k.plostina();
		   int v=k.volumen();
		   System.out.println(k.geta()+" "+k.getb()+" "+k.getc());
		   System.out.println(pp);
		   System.out.println(v);
	   }
}
