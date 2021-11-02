package Zadaca10;

public class Glavna {

	public static void main(String[] args) {
		 Parfem p=new Parfem();
		    p.setIme("Little Black dress");
		    p.setGodinaNaProizvodstvo(2018);
		    p.setProcentAlkohol(3.0);
 		    p.setSodrziAlkohol("True");
            
 		   if(p.getProcentAlkohol()>0)
 		    	System.out.println(p.getIme()+" sodrzi alhohol");
 		    else
 		    	System.out.println("Ne sodrzi alkohol");
	}

}
