package Zadaca01;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<AlociranaMemorija> memoryPerWorkstation=new ArrayList<>();
		ArrayList<Integer> memoryValue=new ArrayList<>();
		int golemina;
		for(int i=0; i<20; i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Vnesete golemina: ");
			golemina=sc.nextInt();
			memoryPerWorkstation.add(new AlociranaMemorija(golemina));
			}
        for(int i=0;i<memoryPerWorkstation.size();i++) {
        	memoryPerWorkstation.get(i).pecati();
        }
        for(int i=0;i<memoryValue.size();i++) {
        	memoryValue.add(memoryPerWorkstation.get(i).getSize());
        }
        System.out.println(memoryValue);
	}

}
