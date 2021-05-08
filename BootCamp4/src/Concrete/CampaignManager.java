package Concrete;
import Abstract.CampaignDal;
import Entities.Campaign;

public class CampaignManager implements CampaignDal {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " " + "kampanyas� eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " " + "kampanyas� silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ " " + "kampanyas� g�ncellendi.");
		
	}

}
