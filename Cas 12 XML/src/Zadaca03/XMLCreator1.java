package Zadaca03;
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

public class XMLCreator1 {
    public static String createXMLDoc(Users user) {
    	String response = "Dokumentot ne e kreiran";
    	try {
    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder doc = docFactory.newDocumentBuilder();
    		Document document = doc.newDocument();
    		
    		Element root = document.createElement("User");
    		Element username = document.createElement("Username");
    		Element email = document.createElement("Email");
    		Element expYear = document.createElement("ExpirationYear");
    		
    		root.appendChild(username);
    		root.appendChild(email);
    		root.appendChild(expYear);
    		
    		username.appendChild(document.createTextNode(user.username));
    		email.appendChild(document.createTextNode(user.email));
    		expYear.appendChild(document.createTextNode(user.expYear));
    		
    		document.appendChild(root);
    		
    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
    		Transformer transformer = transformerFactory.newTransformer();
    		DOMSource source = new DOMSource(document);
    		StreamResult result = new StreamResult(new File("UserXML.xml"));
    		transformer.transform(source, result);
    		response = "Dokumentot e kreiran";
    		}
    	catch(Exception e) {
    		response += "Error: " + e;
    	}
    	return response;
    }
}
