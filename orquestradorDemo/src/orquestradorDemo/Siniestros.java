package orquestradorDemo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "siniestro")
@XmlType(propOrder = {"tipoVehiculo", "usoVehiculo", "numeroPlaca", "numeroSerie", "rfcContratante", "rfcConductor"})
public class Siniestros 
{	
	String tipoVehiculo;
	int usoVehiculo;
	List<NumeroPlaca> numeroPlaca;
	List<NumeroSerie> numeroSerie;
	List<RFCContratante> rfcContratante;
	List<RFCConductor> rfcConductor;
	
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

	List<NumeroPlaca> getNumeroPlaca()
	{
		return numeroPlaca;
	}
	@XmlElement(name = "numeroPlaca", type = NumeroPlaca.class)
	public void setNumeroPlaca(List<NumeroPlaca> numeroPlaca)
	{
		this.numeroPlaca = numeroPlaca;
	}
	
	List<NumeroSerie> getNumeroSerie()
	{
		return numeroSerie;
	}
	@XmlElement(name = "numeroSerie", type = NumeroSerie.class)
	public void setNumeroSerie(List<NumeroSerie> numeroSerie)
	{
		this.numeroSerie = numeroSerie;
	}
	
	List<RFCContratante> getRfcContratante()
	{
		return rfcContratante;
	}
	@XmlElement(name = "rfcContratante", type = RFCContratante.class)
	public void setRfcContratante(List<RFCContratante> rfcContratante)
	{
		this.rfcContratante = rfcContratante;
	}
	
	List<RFCConductor> getRfcConductor()
	{
		return rfcConductor;
	}
	@XmlElement(name = "rfcConductor", type = RFCConductor.class)
	public void setRfcConductor(List<RFCConductor> rfcConductor)
	{
		this.rfcConductor = rfcConductor;
	}
	
	@Override
	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("Tipo de Vehiculo: " + getTipoVehiculo() + "\n");
		stringbuffer.append("Uso de Vehiculo: " + getUsoVehiculo() + "\n");
		stringbuffer.append(getNumeroPlaca() + "\n");
		stringbuffer.append(getNumeroSerie() + "\n");
		stringbuffer.append(getRfcContratante() + "\n");
		stringbuffer.append(getRfcConductor() + "\n");
		
		return stringbuffer.toString();
	}
}
