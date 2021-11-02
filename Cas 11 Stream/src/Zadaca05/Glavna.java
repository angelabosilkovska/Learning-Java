package Zadaca05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class Glavna {

	public static void main(String[] args) throws IOException{
		FileInputStream in;
		FileOutputStream out;
		String text;
		File f=new File("File2.text");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesete text ");
		text=sc.nextLine();
		f.zapishi(text);
		f.procitaj();
		System.out.println();
		f.odrediRecenici();

	}

}
