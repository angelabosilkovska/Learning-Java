package Zadaca20;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
	   ArrayList<String> lista1=new ArrayList<String>();
	   ArrayList<String> lista2=new ArrayList<String>();
	   lista1.add("fdds");
	   lista1.add("vgxdf");
	   lista1.add("dcsd");
	   lista2.add("dsc");
	   lista2.add("fds");
	   lista2.add("sdffv");
	   lista1.retainAll(lista2);
	   System.out.println(lista1);
	   lista1.remove(0);

	}

}
