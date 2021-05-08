package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.entities.concretes.User;
import entities.UserForLoginDto;
import entities.UserForRegisterDto;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	private final GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	private final UserService userService;
	
	public GoogleAuthManagerAdapter(final UserService userService) {
		
		this.userService = userService;
	}
	
	@Override
	public void login(UserForLoginDto userForLoginDto) throws Exception {
		final boolean result = googleAuthManager.auth();
		if(!result) {
			throw new Exception("Google yetkilendirme hatasý!");
			
		}
		System.out.println(userForLoginDto.getEmail()+ " " + " baþarýlý giriþ yaptý!");
		
	}

	@Override
	public void register(UserForRegisterDto userForRegisterDto) throws Exception {
		final boolean result = googleAuthManager.auth();
		if(!result) {
			throw new Exception("Google yetkilendirme hatasý!");
			
		}
		
		final User user = new User(1, userForRegisterDto.getFirstName(), 
				userForRegisterDto.getLastName(),
				userForRegisterDto.getEmail(),
				userForRegisterDto.getPassword());
		userService.add(user);
		
		System.out.println(userForRegisterDto.getEmail()+ " " + "kayýt oldu!");
		
	}

}
