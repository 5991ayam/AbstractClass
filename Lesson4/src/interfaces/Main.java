package interfaces;

public class Main {

	public static void main(String[] args) {
	Logger[] loggers= {new SmsLogger(),new EmailLogger()};	
		
	CustomerManager customerManager= new CustomerManager(loggers);
	Customer ergin= new Customer("1","ahmet","yaman");
	customerManager.Add(ergin);
	}

}
