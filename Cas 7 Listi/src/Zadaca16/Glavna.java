package Zadaca16;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> lista1=new ArrayList<String>();
		lista1.add("gdxg");
		lista1.add("grfg");
		ArrayList<String> lista2=new ArrayList<String>();
		lista2.add("rfg");
		lista2.add("dsvv");
		ArrayList<String> listaunija=new ArrayList<String>();
		listaunija.addAll(lista1);
		listaunija.addAll(lista2);
		ArrayList<String> listapresek=new ArrayList<String>();
		listapresek.addAll(lista1);
		listapresek.addAll(lista2);
		listapresek.retainAll(lista1);
		listapresek.retainAll(lista2);
		System.out.println(listaunija);
		System.out.println(listapresek);
	}

}
