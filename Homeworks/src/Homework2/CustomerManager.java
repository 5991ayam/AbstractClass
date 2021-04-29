package Homework2;

public class CustomerManager{
	
	CustomerManager()
	{
		System.out.println("CustomerManager constructor ");
	}

	public void AddCustomer (Customer pCustomer)
	{
		System.out.println(pCustomer.customerName +" added");
	}
	
	public void RemoveCustomer (Customer pCustomer)
	{
		System.out.println(pCustomer.customerName +" removed");
	}
}
