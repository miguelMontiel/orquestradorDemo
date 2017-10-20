package demo;

import jaxb.*;

public class Main 
{
	public static void main(String []args)
	{
		ProductJAXB productjaxb = new ProductJAXB();
		//productjaxb.marshall();
		//productjaxb.unmarshall();
		productjaxb.marshallList();
		productjaxb.unmarshallList();
	}
}
