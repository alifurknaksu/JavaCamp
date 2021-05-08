package Abstract;
import Entities.Campaign;

public interface CampaignDal {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);

}
