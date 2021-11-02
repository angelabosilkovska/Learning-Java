package Zadaca01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.awt.List;

public class Glavna1 {

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
        	
        	Iterator itr=(Iterator) memoryValue.iterator();
        	while(itr.hasNext()) {
        		Object element=itr.next();
        		System.out.println(element+ "+");
        	}
        }

	}

}
