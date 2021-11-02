package Zadaca18;
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
	public String kreirajXmlFajl(ArrayList<Vozilo>vozila) throws IOException{
		  String response="Dokumentot ne e kreiran";
		  try {
			  DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			  DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			  Document document=documentBuilder.newDocument();
			  
			  Element root=(Element) document.createElement("Vozila");
			  document.appendChild(root);
			  for(int i=0;i<vozila.size();i++) {
				  Element vozilo=(Element) document.createElement("Vozilo");
				  root.appendChild(vozilo);
				  
				  Element marka=document.createElement("Marka");
				  vozilo.appendChild(marka);
				  marka.appendChild(document.createTextNode(vozila.get(i).getMarka()));
				  
				  Element model=document.createElement("Model");
				  vozilo.appendChild(model);
				  model.appendChild(document.createTextNode(vozila.get(i).getModel()));
				  
				  Element boja=document.createElement("Boja");
				  vozilo.appendChild(boja);
				  boja.appendChild(document.createTextNode(vozila.get(i).getBoja()));
				  
				  Element cena=document.createElement("Cena");
				  vozilo.appendChild(cena);
				  cena.appendChild(document.createTextNode(vozila.get(i).getCena()));
			  }
			  TransformerFactory transformerFactory=TransformerFactory.newInstance();
			  Transformer transformer=transformerFactory.newTransformer();
			  DOMSource source=new DOMSource(document);
			  File file=new File("Voziloxml.xml");
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
