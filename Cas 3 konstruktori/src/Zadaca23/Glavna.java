package Zadaca23;

public class Glavna {
    public static void main(String[] args) {
    	Kompjuter k=new Kompjuter("fgdgs","vsdvd",210);
    	System.out.println(k.getgoleminanadisk());
    	System.out.println(k.getgoleminanaram());
    	System.out.println(k.gettipnaprocesor());
    	
    	System.out.println(k.getgoleminanadisk()+k.getgoleminanaram()+k.gettipnaprocesor());
    }
}
