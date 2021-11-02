package Zadaca8;

public class Glavna {
	public static void main(String[] args) {
    	Paralelogram p=new Paralelogram(5, 7, 4);
    	p.pecati();
    	int a=p.plostina();
 	    System.out.println(a);
 	    int b=p.perimetar();
 	    System.out.println(b);
	}
}
