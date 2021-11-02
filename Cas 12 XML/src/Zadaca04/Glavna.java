package Zadaca04;

public class Glavna {
    public static void main(String[] args) {
    	Student student=new Student("Petko","Petkovski","inki567","8");
    	System.out.println(XML.createXMLDoc(student));
    }
}   
