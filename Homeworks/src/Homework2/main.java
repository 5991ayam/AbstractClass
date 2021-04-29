package Homework2;



public class main {

	public static void main(String[] args) {

		CustomerManager customerManager= new CustomerManager();
		
		Customer[] customerArray = GetCustomers(); 
	
		 Customer customer4 = new Customer();
	     customer4.id = 1;
	     customer4.customerName ="Test";
	     customer4.customerSurname = "Test";
		 customerManager.AddCustomer(customer4);
		 customerManager.AddCustomer(customer4);
	}
	
	
	
	public static Customer[] GetCustomers()
	{
		  Customer customer1 = new Customer();
	      customer1.id = 1;
	      customer1.customerName ="Ahmet";
	      customer1.customerSurname = "Yaman";
	      
	      Customer customer2 = new Customer();
	      customer1.id = 1;
	      customer1.customerName ="Mehmet";
	      customer1.customerSurname = "Gunay";
	      
	      Customer customer3 = new Customer();
	      customer1.id = 1;
	      customer1.customerName ="Zeki";
	      customer1.customerSurname = "Yilmaz";
	      
	      Customer[] customers = {customer1, customer2, customer3};
	      return customers;
	}

}
