package Zadaca14;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
	public String kreirajXmlFajl(ArrayList<Student>studenti) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Studenti");
			  document.appendChild(root);
			  for(int i=0;i<studenti.size();i++) {
				  Element student=(Element) document.createElement("Student");
				  root.appendChild(student);
				  
				  Element ime=document.createElement("Ime");
				  student.appendChild(ime);
				  ime.appendChild(document.createTextNode(studenti.get(i).getIme()));
				  
				  Element prezime=document.createElement("Prezime");
				  student.appendChild(prezime);
				  prezime.appendChild(document.createTextNode(studenti.get(i).getPrezime()));
				  
				  Element indeks=document.createElement("Indeks");
				  student.appendChild(indeks);
				  indeks.appendChild(document.createTextNode(studenti.get(i).getIndeks()));
				  
			  }
			  TransformerFactory transformerFactory=TransformerFactory.newInstance();
			  Transformer transformer=transformerFactory.newTransformer();
			  DOMSource source=new DOMSource(document);
			  File file=new File("Studentxml.xml");
			  Result result=new StreamResult(file);
			  transformer.transform(source, result);
			  response="Dokumentot e kreiran";
		  }
		  catch(Exception e) {
			  response +="Error: "+e;
		  }
		  return response;
	   }
}
