package Zadaca21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;

public class Glavna {

	public static void main(String[] args) throws IOException{
		FileInputStream in;
		FileOutputStream out;
		String text="OOP isit";
		File f=new File("Test.txt");
	    f.SaveTest(text);

	}

}
