package Zadaca13;
import java.io.File;
import java.io.IOException;
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

import java.util.ArrayList;

public class XML {
	public String kreirajXmlFajl(ArrayList<Doktor>doktori) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Doktori");
			  document.appendChild(root);
			  for(int i=0;i<doktori.size();i++) {
				  Element doktor=(Element) document.createElement("Doktor");
				  root.appendChild(doktor);
				  
				  Element ime=document.createElement("Ime");
				  doktor.appendChild(ime);
				  ime.appendChild(document.createTextNode(doktori.get(i).getIme()));
				  
				  Element prezime=document.createElement("Prezime");
				  doktor.appendChild(prezime);
				  prezime.appendChild(document.createTextNode(doktori.get(i).getPrezime()));
				  
				  Element specijalizacija=document.createElement("Specijalizacija");
				  doktor.appendChild(specijalizacija);
				  specijalizacija.appendChild(document.createTextNode(doktori.get(i).getSpecijalizacija()));
				  
				  Element plata=document.createElement("Plata");
				  doktor.appendChild(plata);
				  plata.appendChild(document.createTextNode(doktori.get(i).getPlata()));
			  }
			  TransformerFactory transformerFactory=TransformerFactory.newInstance();
			  Transformer transformer=transformerFactory.newTransformer();
			  DOMSource source=new DOMSource(document);
			  File file=new File("Doktorxml.xml");
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
