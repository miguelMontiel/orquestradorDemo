package orquestradorDemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rfcContratante")
public class RFCContratante 
{
	String id_rfcContratante;
	int eventos_rfcContratante;
	
	public String getId_rfcContratante() 
	{
		return id_rfcContratante;
	}
	@XmlElement(name = "id_rfcContratante")
	public void setId_rfcConductor(String id_rfcContratante) 
	{
		this.id_rfcContratante = id_rfcContratante;
	}
	
	public int getEventos_rfcContratante() 
	{
		return eventos_rfcContratante;
	}
	@XmlElement(name = "eventos_rfcContratante")
	public void setEventos_rfcContratante(int eventos_rfcContratante) 
	{
		this.eventos_rfcContratante = eventos_rfcContratante;
	}
	
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("RFC del Contratante: " + "'" + getId_rfcContratante() + "'");
		stringbuffer.append(" y Eventos del Contratante: " + "'" + getEventos_rfcContratante() + "'");
		
		if(getEventos_rfcContratante() > 4)
		{
			System.out.println("¡¡¡El Contratante tiene riesgo de fraude H01!!!" + "\n");
			
			if(getEventos_rfcContratante() > 29)
			{
				System.out.println("Cliente frecuente, no es fraude, sólo es Yessenia" + "\n");
			}
		}
		
		return stringbuffer.toString();
	}
}
