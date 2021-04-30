package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ali = new IndividualCustomer();
		ali.customerNumber = "1234";
		
		
		CorporateCustomer smartMessage = new CorporateCustomer();
		smartMessage.customerNumber = "13332";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "15444";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {ali, smartMessage, abc};
		
		customerManager.addMultiple(customers);
	
	}

}
