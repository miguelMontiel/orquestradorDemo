package orquestradorDemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "siniestro")
public class Siniestros 
{	
	String tipoVehiculo;
	int usoVehiculo;
	int numeroPlaca;
	int numeroSerie;
	int rfcContratante;
	int rfcConductor;
	
	public String getTipoVehiculo()
	{
		return tipoVehiculo;
	}
	@XmlElement(name = "tipoVehiculo")
	public void setTipoVehiculo(String tipoVehiculo)
	{
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public int getUsoVehiculo() 
	{
		return usoVehiculo;
	}
	@XmlElement(name = "usoVehiculo")
	public void setUsoVehiculo(int usoVehiculo) 
	{
		this.usoVehiculo = usoVehiculo;
	}
	
	public int getNumeroPlaca() 
	{
		return numeroPlaca;
	}
	@XmlElement(name = "numeroPlaca")
	public void setNumeroPlaca(int numeroPlaca) 
	{
		this.numeroPlaca = numeroPlaca;
	}
	
	public int getNumeroSerie() 
	{
		return numeroSerie;
	}
	@XmlElement(name = "numeroSerie")
	public void setNumeroSerie(int numeroSerie) 
	{
		this.numeroSerie = numeroSerie;
	}
	
	public int getRfcContratante() 
	{
		return rfcContratante;
	}
	@XmlElement(name = "rfcContratante")
	public void setRfcContratante(int rfcContratante) 
	{
		this.rfcContratante = rfcContratante;
	}
	
	public int getRfcConductor() 
	{
		return rfcConductor;
	}
	@XmlElement(name = "rfcConductor")
	public void setRfcConductor(int rfcConductor) 
	{
		this.rfcConductor = rfcConductor;
	}
	
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer("Tipo de Vehiculo: " + getTipoVehiculo() + "\n");
		if(getNumeroPlaca() > 4 || getNumeroSerie() > 4 || getRfcContratante() > 4 || getRfcConductor() > 4)
		{
			System.out.println("Puede ser fraude!");
		}
		stringbuffer.append("Uso de Vehiculo: " + getUsoVehiculo() + "\n");
		stringbuffer.append("Eventos del Número de Placa: " + getNumeroPlaca() + "\n");
		stringbuffer.append("Eventos del Número de Serie: " + getNumeroSerie() + "\n");
		stringbuffer.append("Eventos del RFC del contratante: " + getRfcContratante() + "\n");
		stringbuffer.append("Eventos del RFC del conductor: " + getRfcConductor() + "\n");
		
		return stringbuffer.toString();
	}
}
