package Concrete;
import Business.CustomerCheckService;
import Entities.Customer;

public class EdevletCheckService implements CustomerCheckService{

	@Override
	public boolean validation(Customer customer) {
		System.out.println("Mernis sistemi aktif, kontrol ediliyor...");
		
		if(customer.getNationalityId().length() == 11) {
			
			System.out.println(customer.getFirstName()+ " " + customer.getLastName()+
					" "+ "isimli kullan�c� ba�ar�yla do�ruland�.");
			return true;

		}else {
			
			System.out.println("Hesap do�rulama ba�ar�s�z!");
			return false;
		}
		
	}

}
