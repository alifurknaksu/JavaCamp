package Abstract;
import Entities.Game;

public interface GameDal {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);

}
