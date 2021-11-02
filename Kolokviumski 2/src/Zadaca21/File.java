package Zadaca21;

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
	   public void SaveTest(String text) throws IOException{
		   out=new FileOutputStream(text1);
		   
		   for(int i=0; i<text.length(); i++) {
	 		   out.write(text.charAt(i));
	 	   }
	   }
}
