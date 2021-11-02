package Zadaca03;
import java.io.IOException;
import java.util.ArrayList;

public class Glavna{
	public static void main(String[] args) throws ZeroLagerQuantityException {
	ArrayList<Mobilen> lista=new ArrayList<Mobilen>();
	Mobilen m1=new Mobilen("aaa", "aaa", 0, 1234);
	Mobilen m2=new Mobilen("aaa", "aaa", 3, 14);
	lista.add(m1);
	lista.add(m2);
	 try {
		 
			MobilShop m=new MobilShop(lista);
			m.funkcija(3);
 
        } catch (ZeroLagerQuantityException ex) {
            System.err.print(ex);
        }
	

	System.out.println();
	System.out.println();
	for(int i=0;i<lista.size();i++)
	System.out.println(lista.get(i).getCena());
}
}
