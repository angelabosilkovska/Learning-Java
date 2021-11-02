package Zadaca28;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(3);
		lista.add(453);
		lista.add(65);
		lista.add(55);
		lista.add(53);
		PovekeOdDvaDuplikati p=new PovekeOdDvaDuplikati(lista);
		p.proveri();

	}

}
