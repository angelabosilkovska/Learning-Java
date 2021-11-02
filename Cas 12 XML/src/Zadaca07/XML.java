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
    public static String createXMLDoc(Vozilo vozilo) {
    	String response="Dokumentot ne e kreiran";
    	try {
    		DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
    		DocumentBuilder doc=docFactory.newDocumentBuilder();
    		Document document=doc.newDocument();
    		
    		Element root=document.createElement("Vozilo");
    		Element marka=document.createElement("Marka");
    		Element model=document.createElement("Model");
    		Element boja=document.createElement("Boja");
    		Element cena=document.createElement("Cena");
    		
    		root.appendChild(marka);
    		root.appendChild(model);
    		root.appendChild(boja);
    		root.appendChild(cena);
    		
    		marka.appendChild(document.createTextNode(vozilo.getMarka()));
    		model.appendChild(document.createTextNode(vozilo.getModel()));
    		boja.appendChild(document.createTextNode(vozilo.getBoja()));
    		cena.appendChild(document.createTextNode(vozilo.getCena()));
    		
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
