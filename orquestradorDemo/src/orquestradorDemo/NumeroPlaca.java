package orquestradorDemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "numeroPlaca")
public class NumeroPlaca 
{
	String id_numeroPlaca;
	int eventos_numeroPlaca;
	
	public String getId_numeroPlaca() 
	{
		return id_numeroPlaca;
	}
	@XmlElement(name = "id_numeroPlaca")
	public void setId_numeroPlaca(String id_numeroPlaca) 
	{
		this.id_numeroPlaca = id_numeroPlaca;
	}
	
	public int getEventos_numeroPlaca() 
	{
		return eventos_numeroPlaca;
	}
	@XmlElement(name = "eventos_numeroPlaca")
	public void setEventos_numeroPlaca(int eventos_numeroPlaca) 
	{
		this.eventos_numeroPlaca = eventos_numeroPlaca;
	}	
	
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("ID de la Placa: " + "'" + getId_numeroPlaca() + "'");
		stringbuffer.append(" y Eventos de la Placa: " + "'" + getEventos_numeroPlaca() + "'");
		
		if(getEventos_numeroPlaca() > 4)
		{
			System.out.println("¡¡¡Está placa tiene riesgo de fraude H01!!!" + "\n");
		}
		
		return stringbuffer.toString();
	}
}
