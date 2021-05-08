import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.GoogleAuthManagerAdapter;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.UserForLoginDto;
import entities.UserForRegisterDto;

public class Main {

	public static void main(String[] args) {
		final UserDao userDao = new HibernateUserDao();
		final UserService userService = new UserManager(userDao);
		final AuthService authService = new AuthManager(userService);
		//final AuthService authService = new GoogleAuthManagerAdapter(userService);
		
		
		final UserForRegisterDto userForRegisterDto = new UserForRegisterDto("ali@ali.com", "13579246", "Ali", "Aksu");
		authService.register(userForRegisterDto);
		
		final UserForLoginDto userForLoginDto = new UserForLoginDto("ali@ali.com", "13579246");
		authService.login(userForLoginDto);


	}

}
