package business.abstracts;

import entities.UserForLoginDto;
import entities.UserForRegisterDto;

public interface AuthService {
	
	void login(UserForLoginDto userForLoginDto) throws Exception;
	void register(UserForRegisterDto userForRegisterDto) throws Exception;

}
