public class Instructor extends User {
	
	private int studentId;
	private double level;

	public Instructor(final String email, final int id, final String name, final String password,
			final int studentId, final double level) {
		super(email, id, name, password);
		this.studentId = studentId;
		this.level = level;
	}

	public int getStudentId() {
		return studentId;
	}

	public double getLevel() {
		return level;
	}

	public void setStudentId(final int studentId) {
		this.studentId = studentId;
	}

	public void setLevel(final double level) {
		this.level = level;
	}
}