package orquestradorDemo;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java.io.File;

public class Orquestrador 
{	
	public static void main(String[] args)
	{	
		try
		{
			JFileChooser jfilechooser = new JFileChooser();
			FileNameExtensionFilter filenameextensionfilter = new FileNameExtensionFilter("Archivos XML", "xml");
			jfilechooser.setFileFilter(filenameextensionfilter);
			int seleccionado = jfilechooser.showOpenDialog(null);
			String archivoSeleccionado = jfilechooser.getSelectedFile().getAbsolutePath();
			
			File file = new File(archivoSeleccionado);
			
			if(seleccionado == JFileChooser.APPROVE_OPTION)
			{
				System.out.println("El archivo seleccionado es: " + jfilechooser.getSelectedFile().getName() + "\n");
			}
			
			JAXBContext jaxbcontext = JAXBContext.newInstance(Siniestros.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			Siniestros siniestros = (Siniestros) unmarshaller.unmarshal(file);
			
			System.out.println(siniestros);
		}
		catch(JAXBException e) { e.printStackTrace(); }
	}
}