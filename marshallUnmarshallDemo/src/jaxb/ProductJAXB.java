package jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ProductJAXB 
{
	public void marshall()
	{
		try
		{
			Product product = new Product("Hola", "Mundo");
			
			JAXBContext jaxbcontext = JAXBContext.newInstance(Product.class);
			Marshaller marshaller = jaxbcontext.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(product, System.out);
			marshaller.marshal(product, new File("src\\data\\product.xml"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void marshallList()
	{
		try
		{
			List<Product> listProduct = new ArrayList<Product>();
			List<Type> listType = new ArrayList<Type>();
			List<Cost> listCost = new ArrayList<Cost>();
			
			listProduct.add(new Product("Mundo", "Hola"));
			listCost.add(new Cost(2));
			listType.add(new Type("Tipo"));
			
			ListProduct listproduct = new ListProduct();
			Product product = new Product();
			
			product.setListCost(listCost);
			
			listProduct.add(product);
			listproduct.setListProduct(listProduct);
			listproduct.setListType(listType);
			
			JAXBContext jaxbcontext = JAXBContext.newInstance(ListProduct.class);
			Marshaller marshaller = jaxbcontext.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(listproduct, System.out);
			marshaller.marshal(listproduct, new File("src\\data\\listProduct.xml"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void unmarshall()
	{
		try
		{
			JAXBContext jaxbcontext = JAXBContext.newInstance(Product.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			Product product = (Product) unmarshaller.unmarshal(new File("src\\data\\product.xml"));
			
			System.out.println("Product Information");
			System.out.println("Name: " + product.getName());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void unmarshallList()
	{
		try
		{
			JAXBContext jaxbcontext = JAXBContext.newInstance(ListProduct.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			ListProduct listproduct = (ListProduct) unmarshaller.unmarshal(new File("src\\data\\listProduct.xml"));
			
			System.out.println("List Product Information");
			for(Product product : listproduct.getListProduct())
			{
				System.out.println("Name: " + product.getName());
				System.out.println("Name 2: " + product.getName2());
				System.out.println("==================");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
