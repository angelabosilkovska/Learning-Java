package Zadaca04;
import java.io.IOException;

public class Glavna extends IOException{

	public static void main(String[] args) throws PrimerGreska{
		String ime="Petko";
		
		try {
			if(ime.equals("Petko"))
				throw new PrimerGreska();
		}catch(Exception e) {

	}
}
}
