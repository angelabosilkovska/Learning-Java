package Zadaca08;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> smerovi=new ArrayList<String>();
		
		smerovi.add("Informaitka");
		smerovi.add("Masinski");
		System.out.println(smerovi);
		
		smerovi.add(0, "Soobrakjaen");
		smerovi.add(1,"Elektro");
		System.out.println(smerovi);
	}

}
