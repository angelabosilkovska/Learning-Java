package Zadaca6;

public class Glavna {
    public static void main(String[] args) {
    	Student s=new Student("Petko", "Petkovski", 34);
    	Student s1=new Student("Trajko", "Trajkovski", 56);
    	s.pecati();
    	System.out.println("------------------");
    	s1.pecati();
    }
}
