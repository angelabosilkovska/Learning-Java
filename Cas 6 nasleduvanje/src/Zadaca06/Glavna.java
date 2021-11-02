package Zadaca06;

public class Glavna {
   public static void main(String[] args) {
	   Pravoagolnik p=new Pravoagolnik(3,5);
	   System.out.println(p.geta());
	   System.out.println(p.getb());
	   Paralelogram p1=new Paralelogram(3,5,4);
	   System.out.println(p1.geta());
	   System.out.println(p1.getb());
	   System.out.println(p1.geth());
   }
}
