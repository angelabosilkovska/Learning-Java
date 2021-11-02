package Zadaca30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Glavna {

	public static void main(String[] args) {
		String[] niza=new String[5];
		String[] niza1=new String[5];
		//se vnesuva niza
		System.out.println("Se vnesuvaat podatoci za niza");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			niza[i]=sc.next();
		}
		//se formira lista od nizata
		ArrayList<String> lista=new ArrayList<String>(Arrays.asList(niza));
		//se pecati nizata
		System.out.println("Se pecsti lista");
		System.out.println(lista);
		//se sortira listat
		Collections.sort(lista);
        //od listata se kreira niza
		System.out.println("Se pecati sortiranata niza");
		niza1=lista.toArray(niza1);
		//se pecati
		for(int i=0;i<niza1.length;i++)
			System.out.println(niza1[i]);
		
		System.out.println();
	}

}
