package Zadaca14;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		ArrayList<Student> student=new ArrayList<>();
		XML object=new XML();
        String ime,prezime,indeks;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
        	System.out.println("vnesete ime: ");
        	ime=sc.next();
        	System.out.println("vnesete prezime: ");
        	prezime=sc.next();
        	System.out.println("vnesete indeks: ");
        	indeks=sc.next();
        	Student s=new Student(ime,prezime,indeks);
        	student.add(s);
        	try {
        		object.kreirajXmlFajl(student);
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        	}
        }
        for(int i=0; i<student.size();i++) {
        	System.out.println();
        	System.out.println(student.get(i).getIme());
        	System.out.println(student.get(i).getPrezime());
        	System.out.println(student.get(i).getIndeks());
        }

	}

}
