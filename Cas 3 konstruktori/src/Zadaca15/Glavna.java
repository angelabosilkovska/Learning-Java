package Zadaca15;

public class Glavna {
    public static void main(String[] args) {
    	Pravoagolnik p=new Pravoagolnik();
    	int p1,pr;
    	p.vnesi();
    	p.pecati();
    	p1=p.a*p.b;
    	pr=2*(p.a*p.b);
    	System.out.println("Plostinata e "+p1+" , a perimetarot e :"+pr);
    }
}
