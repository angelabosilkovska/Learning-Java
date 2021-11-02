package Zadaca24;

public class Glavna {
	public static void main(String[] args) {
		Paralelogram p=new Paralelogram(3,4);
		System.out.println(p.geta());
		System.out.println(p.getb());
		int plostina=(p.geta()*p.getb());
		int perimetar=(2*p.geta()+2*p.getb());
		System.out.println(plostina=perimetar);
	}
    
}
