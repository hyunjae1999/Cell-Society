package Configuration;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
/*
This is an abstract class for a general parser that takes filename, and initializes the document objects needed to parse any xml file.
 */
public abstract class Parser {


    /*
    @param-filename
    This method gets the document that is initialized for parsing xml files
     */
    public Document getDocument(String filename) throws BadFileInputException{
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(filename));
            document.getDocumentElement().normalize();
            return document;
        }
        catch(ParserConfigurationException e){
            //throw new BadFileInputException("Corrupted File");
        }
        catch(SAXException e){
            //throw new BadFileInputException("Corrupted File");

        }
        catch(IOException i){
            //throw new BadFileInputException("Corrupted File");

        }
        return null;
    }
}
