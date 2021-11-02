package Zadaca04;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
   public static void main(String[] args) {
	   ArrayList<String> fax=new ArrayList<String>();
	   fax.add("Tehnicki Fakultet - Bitola");
	   fax.add("Pedagoski Fakultet - Bitola");
	   fax.add("Praven Fakultedt - Kicevo");
	   
	   Collections.sort(fax);
	   System.out.println("Listata e sortirana, i nejzinite elementi se:");
	   for(int i=0; i<fax.size(); i++) {
		   System.out.println(fax.get(i));
	   }
   }
}
