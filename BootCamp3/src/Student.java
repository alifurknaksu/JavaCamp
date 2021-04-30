public class Student extends User {
	private int level;

	public Student(final String email, final int id, final String name, final String password, final int level) {
		super(email, id, name, password);
		this.level = level;
	}

	public int getGrade() {
		return level;
	}

	public void setGrade(final int level) {
		this.level = level;
	}
}