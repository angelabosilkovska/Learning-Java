package Zadaca01;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
    ArrayList<String> names=new ArrayList<>();
		names.add("Aleksandra");
		names.add("Ivana");
		names.add(new String("Maja"));
		names.add(new String("Krstina"));
		names.add(new String("Elena"));
		
		System.out.println("Vo listata se vnesenni "+names.size()+" iminja.");
		System.out.println("Iminjata se: "+names);
	}

}
