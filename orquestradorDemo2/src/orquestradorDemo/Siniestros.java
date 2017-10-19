package orquestradorDemo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import numeroPlaca.NumeroPlaca;

@XmlRootElement(name = "siniestro")
//@XmlType(propOrder = {"tipoVehiculo", "usoVehiculo", "numeroPlaca", "numeroSerie", "rfcContratante", "rfcConductor"})
public class Siniestros 
{	
	List<NumeroPlaca> numeroPlaca;
	
	@XmlElement(name = "numeroPlaca", type = NumeroPlaca.class)
	List<NumeroPlaca> getNumeroPlaca()
	{
		return numeroPlaca;
	}
	public void setNumeroPlaca(List<NumeroPlaca> numeroPlaca)
	{
		this.numeroPlaca = numeroPlaca;
	}
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append(getNumeroPlaca() + "\n");
		
		return stringbuffer.toString();
	}
}
