package Concrete;
import Abstract.CustomerDal;
import Business.CustomerCheckService;
import Entities.Customer;

public class CustomerManager implements CustomerDal {
	
	CustomerCheckService eDevlet;
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.eDevlet = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(eDevlet.validation(customer)) {
			System.out.println(customer.getFirstName()+ " " + customer.getLastName() + "  "+ "kullanýcýsý baþarýyla eklendi.");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+ " " + customer.getLastName() + "  "+ "kullanýcýsý baþarýyla silindi.");
		
	}

	@Override
	public void update(Customer customer) {
		if(eDevlet.validation(customer)) {
			System.out.println(customer.getFirstName()+ " " + customer.getLastName() + "  "+ "kullanýcýsý baþarýyla güncellendi.");
		}
		
	}

}
