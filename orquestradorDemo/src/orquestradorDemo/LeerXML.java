package orquestradorDemo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "siniestros")

public class LeerXML 
{
	Object siniestros;
	String tipoVehiculo;
	int usoVehiculo;
	String numeroPlaca;
	String numeroSerie;
	String rfcContratante;
	String rfcConductor;
	
	@XmlElement
	public String getTipoVehiculo()
	{
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo)
	{
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public int getUsoVehiculo()
	{
		return usoVehiculo;
	}
	public void setUsoVehiculo(int usoVehiculo)
	{
		this.usoVehiculo = usoVehiculo;
	}
	
	public String getNumeroPlaca()
	{
		return numeroPlaca;
	}
	public void setNumeroPlaca(String numeroPlaca)
	{
		this.numeroPlaca = numeroPlaca;
	}
	
	public String getNumeroSerie()
	{
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie)
	{
		this.numeroSerie = numeroSerie;
	}
	
	public String getRFCContratante()
	{
		return rfcContratante;
	}
	public void setRFCContratante(String rfcContratante)
	{
		this.rfcContratante = rfcContratante;
	}
	
	public String getRFCConductor()
	{
		return rfcConductor;
	}
	public void setRFCConductor(String rfcConductor)
	{
		this.rfcConductor = rfcConductor;
	}
}
