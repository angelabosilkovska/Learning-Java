package Zadaca01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
   String fName;
   FileInputStream in;
   FileOutputStream out;
   
   public File(String fName) {
	   this.fName=fName;
   }
   public void zapishi(String text) throws IOException {
	   out=new FileOutputStream(fName);
	   
	   for(int i=0; i<text.length(); i++) {
		   out.write(text.charAt(i));
	   }
   }
   public void prochitaj() throws IOException {
	   in=new FileInputStream("file.txt");
	   int c;
	   while((c=in.read()) != -1) {
		   System.out.println((char) c);
	   }
	   in.close();
   }
}
