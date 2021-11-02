package Zadaca01;
import java.io.IOException;
public class Test {

	public static void main(String[] args) throws IOException {
		File f=new File("file.txt");
		f.zapishi("Ovoj tekst ke bide zapishan vo fajlot");
		f.prochitaj();
	}

}
