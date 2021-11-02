package Zadaca03;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {
   FileInputStream in;
   FileOutputStream out;
   String text1;
   
   public File(String text1) {
	   this.text1=text1;
   }
   public void zapishi(String text) throws IOException{
	   out=new FileOutputStream(text1);
	   
	   for(int i=0; i<text.length(); i++) {
		   out.write(text.charAt(i));
	   }
   }
   public void procitaj() throws IOException{
	   in=new FileInputStream(text1);
	   int c;
	   while((c=in.read()) != -1) {
		   System.out.print((char) c);	   
		   }
	   in.close();
   }
   public void odrediSamoglaski() throws IOException{
		int k=0;
		int c;
		in=new FileInputStream(text1);
		
		while ((c=in.read()) != -1) {
			if((char)c=='A' || (char)c=='a' || (char)c=='E' || (char)c=='e' || (char)c=='I' || (char)c=='i' || (char)c=='O' || (char)c=='o' || (char)c=='U' || (char)c=='u') {
				k++;
			}
		}
		System.out.println(k);
	}
}