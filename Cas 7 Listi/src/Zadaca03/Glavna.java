package Zadaca03;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<String> iminja=new ArrayList<String>();
		iminja.add("Mehanika");
        iminja.add("Informatika");
        System.out.println("Iminjata na smerovite se: "+iminja);
        iminja.add(0, "fdzv");
        iminja.add(2, "dfbff");
        System.out.println("Pecatenje na listata: "+iminja);
	}

}
