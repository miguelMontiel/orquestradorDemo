package orquestradorDemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rfcConductor")
public class RFCConductor
{
	String id_rfcConductor;
	int eventos_rfcConductor;
	
	public String getId_rfcConductor() 
	{
		return id_rfcConductor;
	}
	@XmlElement(name = "id_rfcConductor")
	public void setId_rfcConductor(String id_rfcConductor) 
	{
		this.id_rfcConductor = id_rfcConductor;
	}
	
	public int getEventos_rfcConductor() 
	{
		return eventos_rfcConductor;
	}
	@XmlElement(name = "eventos_rfcConductor")
	public void setEventos_rfcConductor(int eventos_rfcConductor) 
	{
		this.eventos_rfcConductor = eventos_rfcConductor;
	}
	
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("RFC del Conductor: " + "'" + getId_rfcConductor() + "'");
		stringbuffer.append(" y Eventos del Conductor: " + "'" + getEventos_rfcConductor() + "'");
		
		if(getEventos_rfcConductor() > 4)
		{
			System.out.println("¡¡¡El Conductor tiene riesgo de fraude H01!!!" + "\n");
			
			if(getEventos_rfcConductor() > 29)
			{
				System.out.println("Cliente frecuente, no es fraude, sólo es Yessenia" + "\n");
			}
		}
		
		return stringbuffer.toString();
	}
}