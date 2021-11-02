package Zadaca13;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> lista1=new ArrayList<String>();
		lista1.add("Viktor");
		lista1.add("Petko");
		System.out.println(lista1);
		
		ArrayList<String> lista2=new ArrayList<String>();
		lista2.add("Viktor");
		lista2.add("Stojko");
		lista2.add("Trajko");
		System.out.println(lista2);
            		
        lista1.retainAll(lista2);
        System.out.println(lista1);
	}

}
