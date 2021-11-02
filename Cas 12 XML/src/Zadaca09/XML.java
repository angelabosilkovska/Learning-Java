package Zadaca09;
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
   public static String createXMLDoc(Telefon telefon) {
	   String response="Dokumentot ne e kreiran";
	   try {
		   DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
		   DocumentBuilder doc=docFactory.newDocumentBuilder();
		   Document document=doc.newDocument();
		   
		   Element root=document.createElement("Telefon");
		   Element marka=document.createElement("Marka");
		   Element model=document.createElement("Model");
		   Element cena=document.createElement("Cena");
		   
		   root.appendChild(marka);
		   root.appendChild(model);
		   root.appendChild(cena);
		   
		   marka.appendChild(document.createTextNode(telefon.getMarka()));
		   model.appendChild(document.createTextNode(telefon.getModel()));
		   cena.appendChild(document.createTextNode(telefon.getCena()));
		   
		   document.appendChild(root);
		   
		    TransformerFactory transformerFactory=TransformerFactory.newInstance();
			Transformer transformer=transformerFactory.newTransformer();
			DOMSource source=new DOMSource(document);
			StreamResult result=new StreamResult(new File("VrabotenXML.xml"));
			transformer.transform(source, result);
			response="Dokumentot e kreiran";
	   }
	   catch(Exception e) {
		   response += "Error: "+e;
	   }
       return response;
   }
}
