package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
public class Product 
{
	private String name;
	private String name2;
	private List<Cost> listCost = new ArrayList<Cost>();
	
	@XmlElement
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName2() 
	{
		return name2;
	}
	public void setName2(String name2) 
	{
		this.name2 = name2;
	}

	@XmlElement(name = "cost")
	public List<Cost> getListCost() 
	{
		return listCost;
	}
	public void setListCost(List<Cost> listCost) 
	{
		this.listCost = listCost;
	}
	
	public Product(String name, String name2) 
	{
		super();
		this.name = name;
		this.name2 = name2;
	}
	public Product() 
	{
		super();
	}	
}
