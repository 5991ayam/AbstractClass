
public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal  customerDal= new OracleCustomerDal();
		//customerDal.Add();
		
		//CustomerManager customerManager= new CustomerManager(new OracleCustomerDal());
		
		CustomerManager customerManager= new CustomerManager(new MySqlCustomerDal());
		//customerManager.customerDal= new OracleCustomerDal();
		//customerManager.customerDal= new MySqlCustomerDal();
		customerManager.Add();
		
	}

}
