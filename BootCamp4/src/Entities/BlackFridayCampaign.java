package Entities;

public class BlackFridayCampaign extends Campaign{
	
	public BlackFridayCampaign() {
		super.setDiscount(75);
	}
	
	public BlackFridayCampaign(int id, String name, int discount) {
		super(id, name, discount);
	}

}
