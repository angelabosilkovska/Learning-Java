package Zadaca04;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
   public static String createXMLDoc(Student student) {
	   String response = "Dokumentot ne e kreiran";
	   try { 
		   DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
		   DocumentBuilder doc=docFactory.newDocumentBuilder();
		   Document document=doc.newDocument();
		   
		   Element root=document.createElement("Student");
		   Element ime=document.createElement("Ime");
		   Element prezime=document.createElement("Prezime");
		   Element indeks=document.createElement("Indeks");
		   Element prosek=document.createElement("Prosek");
		   
		   root.appendChild(ime);
		   root.appendChild(prezime);
		   root.appendChild(indeks);
		   root.appendChild(prosek);
		   
		   ime.appendChild(document.createTextNode(student.ime));
		   prezime.appendChild(document.createTextNode(student.prezime));
		   indeks.appendChild(document.createTextNode(student.indeks));
		   prosek.appendChild(document.createTextNode(student.prosek));
		   
		   document.appendChild(root);
		   
		   TransformerFactory transformerFactory=TransformerFactory.newInstance();
		   Transformer transformer=transformerFactory.newTransformer();
		   DOMSource source = new DOMSource(document);
		   StreamResult result=new StreamResult(new File("StudentXML.xml"));
		   transformer.transform(source, result);
		   response="Dokumentot e kreiran";
		   }
	   catch(Exception e) {
		   response += "Error: "+e;
	   }
	   return response;
   }
}
