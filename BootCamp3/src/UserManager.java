public class UserManager {
	public void add(final User user) {
		System.out.println(user.getName() +" "+ "is added.");
	}

	public void delete(final User user) {
		System.out.println(user.getName() +" "+ " is deleted.");
	}

	public void getAll() {
		System.out.println("All users listed.");
	}

	public void getById(final int userId) {
		System.out.println("User listed.");
	}

	public void login(final String email, final String password) {
		System.out.println(email + " " + "is online");
	}

	public void logout(final User user) {
		System.out.println(user.getName() + " " + "is offline");
	}

	public void update(final User user) {
		System.out.println(user.getName() + " " + "is updated.");
	}
}