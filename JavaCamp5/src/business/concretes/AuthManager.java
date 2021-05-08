package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.entities.concretes.User;
import core.utils.Validation;
import entities.UserForLoginDto;
import entities.UserForRegisterDto;
import entities.UserForVerificationEmailDto;
import utils.Email;

public class AuthManager implements AuthService {
	
	private final UserService userService;
	

	public AuthManager(UserService userService) {
		this.userService = userService;
	}
	
	public void checkUserName(final String firstName, final String lastName) throws Exception {
		final boolean result = firstName.length() >= 2 && lastName.length() >=2;
		if(!result) {
			throw new Exception("Ad ve SoyAd 2 harften az olamaz!");
		}
 	}
	
	public void checkUserExists(final String email) throws Exception {
		final boolean result = false;
		if(result) {
			throw new Exception("Bu Email adresine sahip bir kullanýcý zaten mevcut!");
		}
	}
	
	public void checkPassword(final String password) throws Exception {
		final boolean result = password.length() >= 6;
		if(!result) {
			throw new Exception("Þifreniz en az 6 haneli olmalý!");
		}
	}

	@Override
	public void login(UserForLoginDto userForLoginDto) throws Exception {
		Validation.validateFieldsEmpty(userForLoginDto.getEmail(),userForLoginDto.getPassword());
		System.out.println(userForLoginDto.getEmail() + " " + "baþarýlý giriþ!");
		
	}

	@Override
	public void register(UserForRegisterDto userForRegisterDto) throws Exception {
		checkUserName(userForRegisterDto.getFirstName(),userForRegisterDto.getLastName());
		Validation.validateEmail(userForRegisterDto.getEmail());
		checkUserExists(userForRegisterDto.getEmail());
		checkPassword(userForRegisterDto.getPassword());
		
		sendVerificationEmail(userForRegisterDto.getEmail());
		final User user = new User(1, 
				userForRegisterDto.getFirstName(), 
				userForRegisterDto.getLastName(),
				userForRegisterDto.getEmail(),
				userForRegisterDto.getPassword());
		
		userService.add(user);
		System.out.println(userForRegisterDto.getEmail()+ "kayýt oldu.");
		
	}
	
	public void sendVerificationEmail(final String email) {
		Email.send(email, "Doðrulama kodu : 1010");
		System.out.println("Doðrulama kodu " + email + "-adresine gönderildi.");
	}
	
	public void verifyVerificationEmail(final UserForVerificationEmailDto userForVerificationEmailDto) {
		System.out.println(userForVerificationEmailDto.getCode() + " kodu ile "
				+ userForVerificationEmailDto.getEmail() + " E-mail adresi baþarýyla doðrulandý");
	}
	

}
