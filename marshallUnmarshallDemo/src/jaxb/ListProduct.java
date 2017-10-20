package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "products")
public class ListProduct 
{
	private List<Product> listProduct = new ArrayList<Product>();
	private List<Type> listType = new ArrayList<Type>();
	
	@XmlElement(name = "product")
	public List<Product> getListProduct() 
	{
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) 
	{
		this.listProduct = listProduct;
	}
	
	@XmlElement(name = "type")
	public List<Type> getListType() 
	{
		return listType;
	}
	public void setListType(List<Type> listType) 
	{
		this.listType = listType;
	}
}
