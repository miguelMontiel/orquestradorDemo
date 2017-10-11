package orquestradorDemo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.StringReader;

public class Orquestrador 
{	
	public static void main(String[] args)
	{	
		jaxbObjectToXML();
	}
	
	private static void jaxbObjectToXML()
	{
		try
		{
			File file = new File("H01.xml");
			JAXBContext jaxbcontext = JAXBContext.newInstance(LeerXML.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			LeerXML leerxml = (LeerXML) unmarshaller.unmarshal(file);
			
			System.out.println(leerxml.getNumeroPlaca());
		}
		catch(JAXBException e) { e.printStackTrace(); }
	}
}