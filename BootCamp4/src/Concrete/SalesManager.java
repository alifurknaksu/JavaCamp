package Concrete;
import Abstract.SaleService;
import Entities.Game;
import Entities.Customer;

public class SalesManager implements SaleService {

	@Override
	public void sale(Customer customer, Game game) {
		double gercekFiyat = game.getPrice();
		if(game.getCampaign() == null) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " +  " kullan�c�s�" + " " + game.getName()
			+" " +  " oyununu " + " " + game.getPrice() +" " + " TL'ye sat�n ald�");
		}else {
			
			double indirimliFiyat = game.getPrice() - game.getPrice() * game.getCampaign().getDiscount() / 100;
			game.setPrice(indirimliFiyat);
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + "kullan�c�s�" + " "+ game.getName()
			+" " + " isimli oyunu "+" " + game.getPrice() + " " + " TL'ye sat�n ald� (ger�ek fiyat : " + gercekFiyat + " TL)");
		}
		
		
		
	}

}
