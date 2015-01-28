package pviz;

import de.martin_loetzsch.dotml.ClusterOrGraph;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws JAXBException, ParserConfigurationException, IOException, SAXException {
        JAXBContext jc=JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance( );
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(Paths.get(args[0]).toUri().toASCIIString());
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Element documentElement = doc.getDocumentElement();
        JAXBElement <PolicyType>e= (JAXBElement) unmarshaller.unmarshal(doc, PolicyType.class);
        PolicyType value = e.getValue();


        System.err.println("r: "+new ReflectionToStringBuilder(value).toString());
    }
}
