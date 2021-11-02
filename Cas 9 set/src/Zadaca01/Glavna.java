package Zadaca01;
import java.util.HashSet;
import java.util.Set;

public class Glavna {

	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("a");
		set1.add("a");
		set1.add("a");
		System.out.println(set1);
        System.out.println("Mnozestvoto ime "+set1.size()+" elementi/i.");
	}

}
