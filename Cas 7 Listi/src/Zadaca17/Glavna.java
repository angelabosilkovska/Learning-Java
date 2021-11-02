package Zadaca17;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> iminja=new ArrayList<String>();
		iminja.add("Nalgesin");
		iminja.add("Benalgin");
		iminja.add("Analgin");
		if(iminja.get(iminja.size()-1).equals("Analgin")) 
			System.out.println("Lekot se koristi za glavobolka");
		else
			System.out.println("Namenata na lekot e nepoznata");
	}

}
