package orquestradorDemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "numeroSerie")
public class NumeroSerie 
{
	String id_numeroSerie;
	int eventos_numeroSerie;
	
	public String getId_numeroSerie() 
	{
		return id_numeroSerie;
	}
	@XmlElement(name = "id_numeroSerie")
	public void setId_numeroSerie(String id_numeroSerie) 
	{
		this.id_numeroSerie = id_numeroSerie;
	}
	
	public int getEventos_numeroSerie() 
	{
		return eventos_numeroSerie;
	}
	@XmlElement(name = "eventos_numeroSerie")
	public void setEventos_numeroSerie(int eventos_numeroSerie) 
	{
		this.eventos_numeroSerie = eventos_numeroSerie;
	}
	
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("ID del Número de Serie: " + "'" + getId_numeroSerie() + "'");
		stringbuffer.append(" y Eventos Número de Serie: " + "'" + getEventos_numeroSerie() + "'");
		
		if(getEventos_numeroSerie() > 4)
		{
			System.out.println("¡¡¡Esté número de Serie tiene riesgo de fraude H01!!!" + "\n");
		}
		
		return stringbuffer.toString();
	}
}
