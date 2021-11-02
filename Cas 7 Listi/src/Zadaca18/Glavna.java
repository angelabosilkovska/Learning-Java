package Zadaca18;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<String>();
		int i;
		for(i=5;i<21;i=i+5) {
			lista.add("mail"+i+"@yahoo.com");
		}
		
		System.out.println(lista);
	}
}
