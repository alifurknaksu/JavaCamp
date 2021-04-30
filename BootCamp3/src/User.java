public class User {
	private String email;
	private int id;
	private String name;
	private String password;

	public User(final String email, final int id, final String name, final String password) {
		this.email = email;
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

}