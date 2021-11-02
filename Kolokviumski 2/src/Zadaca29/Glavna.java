package Zadaca29;
import java.io.IOException;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) throws IOException{
		ArrayList<String> lista=new ArrayList<String>();
		
		Testiranje testiranje=new Testiranje(lista,2000);
		testiranje.start();
		while(true) {
			int c;
			String s=" ";
			while((c=System.in.read())!=2)
				s+=(char)c;
			lista.add(s);
		}

	}

}
