import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.EdevletCheckService;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Customer;
import Entities.Game;
import Entities.BlackFridayCampaign;

public class Main {

	public static void main(String[] args) {
		
		BlackFridayCampaign campaign = new BlackFridayCampaign(1,"BlackFriday", 75);
		Customer customer =  new Customer(1, "Ali", "Aksu", "12312312312", "1994");
		Game game = new Game(1, "Erzurum", 35);
		
		
		CustomerManager customerManager = new CustomerManager(new EdevletCheckService());
		
		customerManager.add(customer);
		customerManager.delete(customer);
		customerManager.update(customer);
		
		GameManager gameManager = new GameManager();
		
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		SalesManager salesManager = new SalesManager();
		
		salesManager.sale(customer, game);
		
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		


	}

}
