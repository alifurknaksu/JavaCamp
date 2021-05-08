package Concrete;
import Abstract.SaleService;
import Entities.Game;
import Entities.Customer;

public class SalesManager implements SaleService {

	@Override
	public void sale(Customer customer, Game game) {
		double gercekFiyat = game.getPrice();
		if(game.getCampaign() == null) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " +  " kullanýcýsý" + " " + game.getName()
			+" " +  " oyununu " + " " + game.getPrice() +" " + " TL'ye satýn aldý");
		}else {
			
			double indirimliFiyat = game.getPrice() - game.getPrice() * game.getCampaign().getDiscount() / 100;
			game.setPrice(indirimliFiyat);
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + "kullanýcýsý" + " "+ game.getName()
			+" " + " isimli oyunu "+" " + game.getPrice() + " " + " TL'ye satýn aldý (gerçek fiyat : " + gercekFiyat + " TL)");
		}
		
		
		
	}

}
