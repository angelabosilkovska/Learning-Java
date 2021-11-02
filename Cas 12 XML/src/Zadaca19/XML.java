package Zadaca19;
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
	public String kreirajXmlFajl(ArrayList<Grad>gradovi) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Gradovi");
			  document.appendChild(root);
			  for(int i=0;i<gradovi.size();i++) {
				  Element grad=(Element) document.createElement("Grad");
				  root.appendChild(grad);
				  
				  Element ime=document.createElement("Ime");
				  grad.appendChild(ime);
				  ime.appendChild(document.createTextNode(gradovi.get(i).getIme()));
				  
				  Element drzava=document.createElement("Drzava");
				  grad.appendChild(drzava);
				  drzava.appendChild(document.createTextNode(gradovi.get(i).getDrzava()));
				  
				  Element brNaZiteli=document.createElement("BrNaZiteli");
				  grad.appendChild(brNaZiteli);
				  brNaZiteli.appendChild(document.createTextNode(gradovi.get(i).getBrNaZiteli()));
				  
				 }
			  TransformerFactory transformerFactory=TransformerFactory.newInstance();
			  Transformer transformer=transformerFactory.newTransformer();
			  DOMSource source=new DOMSource(document);
			  File file=new File("Gradxml.xml");
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
