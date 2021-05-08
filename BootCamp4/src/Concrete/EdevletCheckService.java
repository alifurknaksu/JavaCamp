package Concrete;
import Business.CustomerCheckService;
import Entities.Customer;

public class EdevletCheckService implements CustomerCheckService{

	@Override
	public boolean validation(Customer customer) {
		System.out.println("Mernis sistemi aktif, kontrol ediliyor...");
		
		if(customer.getNationalityId().length() == 11) {
			
			System.out.println(customer.getFirstName()+ " " + customer.getLastName()+
					" "+ "isimli kullanýcý baþarýyla doðrulandý.");
			return true;

		}else {
			
			System.out.println("Hesap doðrulama baþarýsýz!");
			return false;
		}
		
	}

}
