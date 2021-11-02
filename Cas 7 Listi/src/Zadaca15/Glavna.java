package Zadaca15;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> lista1=new ArrayList<String>();
		lista1.add("Angela");
		lista1.add("Marija");
		System.out.println(lista1);
		
		ArrayList<String> lista2=new ArrayList<String>();
		lista2.add("Emilija");
		lista2.add("Sara");
		System.out.println(lista2);
		
		ArrayList<String> listaunija=new ArrayList<String>();
	       listaunija.addAll(lista1);
	       listaunija.addAll(lista2);
	       System.out.println(listaunija);

	}

}
