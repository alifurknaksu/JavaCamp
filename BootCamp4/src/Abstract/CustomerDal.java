package Abstract;
import Entities.Customer;

public interface CustomerDal {
	
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);

}
