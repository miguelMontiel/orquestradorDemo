package jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cost")
public class Cost 
{
	private int myCost;

	@XmlElement
	public int getMyCost() 
	{
		return myCost;
	}
	public void setMyCost(int myCost) 
	{
		this.myCost = myCost;
	}
	
	public Cost(int myCost) 
	{
		super();
		this.myCost = myCost;
	}
	public Cost() 
	{
		super();
	}
}
