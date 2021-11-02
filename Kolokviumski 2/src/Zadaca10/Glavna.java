package Zadaca10;
import java.util.ArrayList;

	public class Glavna {

		public static void main(String[] args) {
		   ArrayList<String> lista1=new ArrayList<String>();
		   lista1.add("ime");
		   lista1.add("prezime");
	       System.out.println(lista1);
	       
	       ArrayList<String> lista2=new ArrayList<String>();
	       lista2.add("grad");
	       lista2.add("drzava");
	       System.out.println(lista2);
	       
	       ArrayList<String> listaunija=new ArrayList<String>();
	       listaunija.addAll(lista1);
	       listaunija.addAll(lista2);
	       System.out.println(listaunija);
		}
}
