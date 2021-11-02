package Zadaca07;
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
	public String kreirajXmlFajl(String imeNaFajl) {
		   String response="Dokumentot ne e kreiran";
		   try {
			   DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
			   DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
			   Document document=documentBuilder.newDocument();
			   
			   Element root=(Element) document.createElement("Avtomobil");
			   Element marka=(Element) document.createElement("Marka");
			   Element opel=(Element) document.createElement("Opel");
			   Element model=(Element) document.createElement("Model");
			   Element astra=(Element) document.createElement("Astra");
			   Element cena=(Element) document.createElement("Cena");
               
			   document.appendChild(root);
			   root.appendChild(marka);
			   marka.appendChild(opel);
			   root.appendChild(model);
			   model.appendChild(astra);
			   root.appendChild(cena);
			   
			    Source source = new DOMSource(document);
				File file = new File(imeNaFajl);
				Result result = new StreamResult(file);
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				transformer.transform(source, result);
				response="Dokumentot e kreiran";
				} catch (Exception e) {
					response +="Error: "+e;
				}
		   return response;
}
}