package jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "type")
public class Type 
{
	private String typeProduct;

	@XmlElement
	public String getTypeProduct() 
	{
		return typeProduct;
	}
	public void setTypeProduct(String typeProduct) 
	{
		this.typeProduct = typeProduct;
	}
	
	public Type(String typeProduct) 
	{
		super();
		this.typeProduct = typeProduct;
	}
	public Type() 
	{
		super();
	}
	
	
}
