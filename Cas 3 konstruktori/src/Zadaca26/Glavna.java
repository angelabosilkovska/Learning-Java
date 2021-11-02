package Zadaca26;

public class Glavna {
    public static void main(String[] args) {
    	Kvadar k=new Kvadar();
    	k.vnesi();
    	int p=2*(k.geta()*k.getb()+k.getb()*k.getc()+k.geta()*k.getc());
    	int v=k.geta()*k.getb()*k.getc();
    	System.out.println(p+v);
    }
}
